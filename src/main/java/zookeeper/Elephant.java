package zookeeper;

import java.time.LocalDate;

public class Elephant extends Mammal {
    private String name;
    private String colour;
    private LocalDate dateOfBirth;

    public Elephant(String name, LocalDate dateOfBirth, String colour) {
        this.name = name;
        this.colour = colour;
        this.dateOfBirth = dateOfBirth;
    }

//    public Elephant(String name) {
//        this(name, LocalDate.now());
//    }

//    //public Elephant(String name, LocalDate dateOfBirth) {
//        this(name, LocalDate.now(), "grey");
//    }
//        public Elephant(String name, LocalDate dateOfBirth, String colour);{
//            this.name = name;
//            this.dateOfBirth = dateOfBirth;
////            this.colour = colour;
//
//        }


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