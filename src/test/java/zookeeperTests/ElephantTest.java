package zookeeperTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import zookeeper.Animal;
import zookeeper.Elephant;
import zookeeper.Mammal;

import javax.lang.model.element.Name;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElephantTest {

    @Test
    @DisplayName("Test the sound an elephant makes")
    public void testElephantSound(){
        Elephant testElephant = new Elephant ("Dumbo", "grey", 12);
        assertEquals("Tooooooot", testElephant.toot(),"I do not make that sound");

    }
}
