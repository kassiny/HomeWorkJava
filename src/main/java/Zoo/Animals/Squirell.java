package Zoo.Animals;
import Zoo.Model.*;

public class Squirell extends AbstactAnimal {
    public Squirell(String name) {
        super.name = name;
        super.specie = Species.SQUIRREL;
    }
}
