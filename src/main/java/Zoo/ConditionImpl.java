package Zoo;
import Zoo.Model.*;

import java.util.ArrayList;
import java.util.List;

public class ConditionImpl implements Condition {
    protected ArrayList<Species> avaibaleFor;

    public ConditionImpl (ArrayList<Species> avaibaleFor) {
        this.avaibaleFor = avaibaleFor;
    }

    @Override
    public List<Species> isAvailableFor() {
        return avaibaleFor;
    }

    public void addAnimal(Species animal) {
        avaibaleFor.add(animal);
    }
}
