package plants;

import java.util.Random;

import interfaces.*;

public class Flower extends Plant implements Tasty, Dangerous{
    public String color;
    protected int numPetals;
    
    Flower(){
        this.color = "white";
        this.numPetals = 5;
        this.height = 6.0;
        this.poisonous = false;
        this.mass = 10;
    }
    
    public Flower(String color, int numPetals, boolean poisonous, double height, double mass){
        this.color = color;
        this.numPetals = numPetals;
        this.height = height;
        this.poisonous = poisonous;
        this.mass = mass;
    }
    public void bloom(){
        System.out.println("A flower has bloomed.");
    }
    public void bloom(int numBlooms){
        System.out.println(numBlooms + " flowers have bloomed");
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
        if(mass>10){
            qual++;
        }
        if(numPetals>=3){
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
    private static int randomNumber(){
        Random rand = new Random();
        int random = rand.nextInt(6);
        return random;
    }
    protected void grow() {
        height = randomNumber();
        System.out.println("The flower grew " + height + " inches.");
    }

    public void makeOxygen(){
        System.out.println("Some O2 producesd.");
    }

    public void procreate(){
        Flower babyFlower = new Flower();
        babyFlower.grow();
        babyFlower.die();
    }
}
