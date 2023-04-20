public class PetNeeds {
    private int hunger;
    private int thrist;
    private int happiness;

    public PetNeeds() {
        hunger = 50;
        thrist = 50;
        happiness = 50;

    }
    public void decreaseHunger(int amount){
        hunger -= amount;

        if(hunger < 0){
            hunger = 0;
        }

    }
    public void decreaseThrist(int amount){
        thrist -= amount;

        if(thrist < 0){
            thrist = 0;
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
        this.thrist = thrist;
    }
}


