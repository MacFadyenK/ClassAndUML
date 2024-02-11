package plants;

import java.util.Random;
import interfaces.Dangerous;

public class Tree extends Plant implements Dangerous{
    protected final String TYPE;
    private static boolean hasLeaves;
    public static String season;
    public Tree(){
        this.height = 240;
        this.TYPE = "Oak";
        this.age = 30;
    }
    public Tree(int height, String type, int age){
        this.height = height;
        this.TYPE = type;
        this.age = age;
    }

    protected void grow(){
        Random rand = new Random();
        height = rand.nextInt(24);
    }
    public void makeOxygen(){
        System.out.println("Some O2 was produced");
    }

    public void procreate(){
        Tree babyTree = new Tree(6, this.TYPE, 0);
        babyTree.grow();
        babyTree.die();
    }

    public boolean danger(){
        if(poisonous){
            return true;
        }else{
            return false;
        }
    }

    private static void loseLeaves(){
        if(hasLeaves){
            hasLeaves = false;
        }
    }
    private static void gainLeaves(){
        if(!hasLeaves){
            hasLeaves = true;
        }
    }
    public static void changeSeason(){
        switch (season) {
            case "summer":
                season = "fall";
                loseLeaves();
                break;
            case "fall":
                season = "winter";
                loseLeaves();
                break;
            case "winter":
                season = "spring";
                gainLeaves();
                break;
            case "spring":
                season = "summer";
                gainLeaves();
                break;
        }
    }
    public static void changeSeason(String newSeason){
        season = newSeason;
        switch (season) {
            case "summer":
                loseLeaves();
                break;
            case "fall":
                loseLeaves();
                break;
            case "winter":
                gainLeaves();
                break;
            case "spring":
                gainLeaves();
                break;
        }
    }
}
