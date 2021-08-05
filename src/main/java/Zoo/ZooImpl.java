package Zoo;

import Zoo.Model.Animal;
import Zoo.Model.Species;

import java.util.*;

public class ZooImpl implements Zoo {
    protected List<InhibitionLog> history;
    protected List<CageImpl> cages;
    protected Map<Animal, Integer> animals;
    private static ZooImpl zoo;

    public static ZooImpl getZoo() {
        if (zoo == null) {
            zoo = new ZooImpl();
            return zoo;
        }
        else {
            return zoo;
        }
    }

    private ZooImpl () {
        history = new ArrayList<InhibitionLog>();
        cages = new ArrayList<CageImpl>();
        cages.add(new CageImpl.CageBuilder().
                setNumber(1).
                setArea(5.5).
                setVacant(true).
                 setCondition(new ConditionImpl(new ArrayList<Species>(Arrays.asList(Species.SQUIRREL)))).
                        getCage());

        cages.add(new CageImpl.CageBuilder().
                setNumber(2).
                setArea(10).
                setVacant(true).
                setCondition(new ConditionImpl(new ArrayList<Species>(Arrays.asList(Species.PENGUIN)))).
                getCage());

        cages.add(new CageImpl.CageBuilder().
                setNumber(3).
                setArea(50).
                setVacant(true).
                setCondition(new ConditionImpl(new ArrayList<Species>(Arrays.asList(Species.LEON)))).
                getCage());

        cages.add(new CageImpl.CageBuilder().
                setNumber(4).
                setArea(60).
                setVacant(true).
                setCondition(new ConditionImpl(new ArrayList<Species>(Arrays.asList(Species.GIRAFFE)))).
                getCage());
        animals = new HashMap<>();

    }

    @Override
    public void checkInAnimal(Animal animal) {
        if (animals.containsKey(animal)) {
            throw new IllegalArgumentException("that animal already lives here");
        }
        //ищем клетку
        boolean foundCage = false;
        for (CageImpl cage: cages
             ) {
            if(cage.isVacantCage() &&
                    cage.getCondition().isAvailableFor().contains(animal.getSpecies())) {
                animals.put(animal,cage.number);
                cage.setVacant(false);
                cages.get(cages.indexOf(cage)).setVacant(false);
                foundCage = true;
                history.add(new InhibitionLog(new Date(System.currentTimeMillis()),
                        null, animal.getSpecies(),animal.getName() ));
            }
        }
        if (!foundCage) {
            throw new IllegalArgumentException("No free cage for such animal");
        }

    }

    @Override
    public void checkOutAnimal(Animal animal) {
        Integer animalsCageNumber = animals.get(animal);
        if (animals.containsKey(animal)) {
            for (CageImpl cage: cages
                 ) {
                if (animalsCageNumber.equals(cage.getNumber())) {
                    cage.setVacant(true);
                    break;
                }
            }
            //обновляем лог
            for (InhibitionLog log:history
                 ) {
                if (log.getAnimalSpecies().equals(animal.getSpecies()) &&
                        log.getAnimalName().equals(animal.getName()) && log.getCheckOutDate()==null) {
                    log.updateCheckOutDate(new Date(System.currentTimeMillis()));
                }
            }
            animals.remove(animal);

        }
        else {
            throw new IllegalArgumentException("Such animal does not live here");
        }

    }

    @Override
    public List<InhibitionLog> getHistory() {
        return history;
    }
}
