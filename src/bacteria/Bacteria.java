package bacteria;

import interfaces.Dangerous;
import livingThings.LivingThings;

public class Bacteria extends LivingThings implements Dangerous {
    private boolean infectious;
    protected final String SPECIES;
    Bacteria(){
        this.infectious = false;
        this.SPECIES = "Yeast";
    }
    protected Bacteria(boolean isInfectious, String bactSpecies){
        this.infectious = isInfectious;
        this.SPECIES = bactSpecies;
    }

    public void procreate(){
        Bacteria babyBacteria = new Bacteria(this.poisonous, this.SPECIES);
        babyBacteria.die();
    }
    public boolean danger(){
        if(this.infectious){
            return true;
        }else{
            return false;
        }
    }

    protected int numBacteria = 1;
    private void split(){
        numBacteria *=2;
    }
    public void split(int times){
        for(int i = 0; i<times; i++){
            split();
        }       
    }
}
