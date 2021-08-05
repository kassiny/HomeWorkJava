package Zoo;

import Zoo.Model.Species;

import java.util.Date;

public class Logger extends InhibitionLog {
    public Logger(Date checkInDate, Date checkOutDate, Species animalSpecies, String animalName) {
        super(checkInDate, checkOutDate, animalSpecies, animalName);
    }

    public void log(String message) {

    }
}
