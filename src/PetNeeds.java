public class PetNeeds {
    private int hunger;
    private int thurst;
    private int happiness;

    public PetNeeds() {
        hunger = 50;
        thurst = 50;
        happiness = 50;

    }
    public void decreaseHunger(int amount){
        hunger -= amount;

        if(hunger < 0){
            hunger = 0;
        }

    }
    public void decreaseThurst(int amount){
        thurst -= amount;

        if(thurst < 0){
            thurst = 0;
        }

    }
    public void increaseHappiness(int amount){
        happiness += amount;

        if(happiness >= 100){
            happiness = 100;
        }

    }
    public void setHunger(int hunger){
        this.hunger = hunger;
    }
    public void setHappiness(int happiness){
        this.happiness = happiness;
    }
    public void setThrist(int thrist){
        this.thurst = thrist;
    }

    //you did not include getters for all attributes.


    public int getHunger() {
        return hunger;
    }

    public int getThurst() {
        return thurst;
    }

    public int getHappiness() {
        return happiness;
    }
}


