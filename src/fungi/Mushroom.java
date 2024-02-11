package fungi;

import interfaces.*;
import livingThings.LivingThings;

public class Mushroom extends LivingThings implements Tasty, Dangerous{

    private Mushroom(){
        this.poisonous = false;
        this.mass = 20;
    }

    protected Mushroom(boolean poisonous, double mass){
        this.poisonous = poisonous;
        this.mass = mass;
    }

    public void procreate(){
        Mushroom babyMushroom = new Mushroom();
        babyMushroom.die();
    }
    public void procreate(int amount){
        for(int i = 0; i<amount; i++){
            Mushroom babyMushroom = new Mushroom();
            babyMushroom.die();
        }
    }

    public boolean eatible(){
        if(!poisonous){
            return true;
        }else{
            return false;
        }
    }

    public int quality(){
        int qual =0;
        if(mass>20){
            qual++;
        }
        return qual;
    }
    public boolean danger(){
        if(poisonous){
            return true;
        }else{
            return false;
        }
    }
}
