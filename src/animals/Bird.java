package animals;

import livingThings.LivingThings;

public class Bird extends LivingThings {
    
    protected double wingspan;
    public Bird(){
        this.age = 1;
        this.wingspan = 30.0;

    }

    private Bird(int age, double wingspan){
        this.age = age;
        this.wingspan = wingspan;
    }

    public void procreate(){
        Bird babyBird = new Bird(0, 10.0);
        babyBird.die();
    }

    public void fly(){
        System.out.println("The bird is flying");
    }
    public void fly(double speedMph){
        System.out.println("The bird is flying at "+speedMph+" mph");
    }

}
