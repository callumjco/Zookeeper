package zookeeper;

public class Elephant extends Mammal {
    private String name;
    private String colour;
    private int dateOfBirth;

    public Elephant(String name, String colour, int dateOfBirth) {
        this.name = name;
        this.colour = colour;
        this.dateOfBirth = dateOfBirth;
    }

    public String toot() {
        return "Tooooooot";
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void eat (){
        System.out.println("I eat fruits and branches");
    }
}