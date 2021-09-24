package zookeeper;

public abstract class Mammal extends Animal {

    @Override
    public void breathe() {
      System.out.println("Take a deep breath");
    }

    public void reproduce() {
        System.out.println("I give live birth");
    }
}
