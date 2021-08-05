package Zoo.Animals;

import Zoo.Model.Species;

public class Penguin extends AbstactAnimal {
    public Penguin(String name) {
        super.name = name;
        super.specie = Species.PENGUIN;
    }
}
