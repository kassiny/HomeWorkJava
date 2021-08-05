package Zoo;

import Zoo.Animals.Giraffe;
import Zoo.Animals.Squirell;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZooImplTest {
    @Test
    public void CanCheckInAnAnimal() {
        Assertions.assertDoesNotThrow(()->{
            ZooImpl.getZoo().checkInAnimal(new Squirell("squirrelll"));
        });
    }
    @Test
    public void CantCheckInSameSpecieTwice () {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
           ZooImpl.getZoo().checkInAnimal(new Squirell("Squirrel"));
           ZooImpl.getZoo().checkInAnimal(new Squirell("Squirrel"));
        });
    }
    @Test
    public void cantCheckoutAnimalthatDoesNotLive() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
           ZooImpl.getZoo().checkOutAnimal(new Giraffe("giraffe"));
        });
    }

    @Test
    public void canCheckInAndCheckOut() {
        Assertions.assertDoesNotThrow(()->{
            ZooImpl.getZoo().checkInAnimal(new Squirell("Liza"));
            ZooImpl.getZoo().checkOutAnimal(new Squirell("Liza"));
        });
    }

}