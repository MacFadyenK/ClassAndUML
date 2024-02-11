package animals;

public class Dog extends Mammal {
    public final String BREED;
    private String favoriteToy;
    protected Dog(){
        this.BREED = "mutt";
        this.age = 4;
        this.mass = 30000;
    }
    public Dog(String breed, int age, double mass, String favToy){
        this.BREED = breed;
        this.age = age;
        this.mass = mass;
        this.favoriteToy = favToy;
    }
    public void procreate(){
        Dog babyDog = new Dog(this.BREED, 0, 1000, "ball");
        babyDog.die();
    }

    public void play(){
        System.out.println("The dog is playing");
    }

    public void play(String toy){
        if(toy.equals(this.favoriteToy)){
            System.out.println("Dog plays with toy.");
        }
    }
}
