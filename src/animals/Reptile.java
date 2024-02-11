package animals;

import interfaces.Dangerous;
import livingThings.LivingThings;

public class Reptile extends LivingThings implements Dangerous {
    private boolean venomous;
    Reptile(){
        this.age = 3;
        this.mass = 1000;
        this.venomous = false;
    }

    Reptile(int age, double mass, boolean venomous){
        this.age = age;
        this.mass = mass;
        this.venomous = venomous;
    }
    public void procreate(){
        Reptile babyReptile = new Reptile(0, 20, this.venomous);
        babyReptile.die();
    }

    public boolean danger(){
        if(venomous){
            return true;
        }else{
            return false;
        }
    }

    protected void poke(){
        System.out.println("The reptile bit you.");
    }
    protected void poke(double pokeSpeed){
        if(pokeSpeed<5){
            System.out.println("The reptile bit you");
        }else{
            System.out.println("You poked the reptile faster than it could bite you");
        }
    }

}