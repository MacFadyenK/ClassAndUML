package plants;

import livingThings.LivingThings;

public abstract class Plant extends LivingThings {
    public double height;
    private boolean useless = false;
    public void isUseless(){
        if(useless){
            System.out.println("This plant is useless");
        }
    }
    protected abstract void grow();
    public abstract void makeOxygen();
}
