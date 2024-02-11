package animals;

import livingThings.LivingThings;

public class Mammal extends LivingThings {
    private static final boolean IS_WARM_BLOODED = true;
    protected Mammal(){
        this.age = 2;
    }

    Mammal(int age){
        this.age = age;
    }

    public void procreate(){
        Mammal babyMammal = new Mammal(0);
        babyMammal.die();
    }
    protected void willFreeze(){
        if(IS_WARM_BLOODED){
            System.out.println("Mammal does not freeze");
        }
    }
    protected void willFreeze(int temperature){
        if(temperature<-30){
            System.out.println("Mammal will freeze");
        }else{
            System.out.println("Mammal will not freeze");
        }
    }

}
