package livingThings;
public abstract class LivingThings {
    protected boolean poisonous;
    public int age;
    protected double mass;
    private final boolean IMMORTAL = false;

    public void die(){
        if(!IMMORTAL){
        System.out.println("A death has occurred");
        }
    };
    public abstract void procreate();
}
