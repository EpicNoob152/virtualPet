public class VirtualPet {
    private String name;
    private int age;
    private PetNeeds petNeeds;

    public VirtualPet(String name, int age){
    this.name = name;
    this.age = age;
    this.petNeeds = new PetNeeds();

    }
    private int getRandomNumber(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);

    }
    public void feed(){
        int decreaseHunger =  getRandomNumber(10, 20);
        petNeeds.decreaseHunger(decreaseAmount);
    }
    public void drink(){
        int decreasethrist =  getRandomNumber(10, 20);
        petNeeds.decreaseThrist(decreaseAmount);
    }
    public void play(){
        int increasehappiness =  getRandomNumber(10, 20);
        petNeeds.increaseHappiness(decreaseAmount);
    }
public boolean isSick(){
        return petNeeds.getHunger() >=100|| petNeeds.getThurst() >=100;
}

public boolean isSad() {return petNeeds.getHappiness() <= 0;}

    public void printStatus(){
        System.out.println(name);
        System.out.println(age);
        System.out.println("Hunger: " + petneeds.getHunger() + "/100");
        System.out.println("Thirst: " + petneeds.getThirst() + "/100");
        System.out.println("Happiness: " + petneeds.getHappiness() + "/100");
        System.out.println();
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public PetNeeds getPetNeeds(){
        return petneeds;
    }

}
