package Zoo.Animals;
import Zoo.Model.*;

import java.util.Objects;

public abstract class AbstactAnimal implements Animal {
    protected String name;
    protected Species specie;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public Species getSpecies() {
        return specie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstactAnimal)) return false;
        AbstactAnimal that = (AbstactAnimal) o;
        return Objects.equals(name, that.name) && specie == that.specie;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, specie);
    }
}
