package Zoo;


import Zoo.Animals.Giraffe;
import Zoo.Animals.Leon;
import Zoo.Animals.Penguin;
import Zoo.Animals.Squirell;
import Zoo.Model.Animal;

import java.util.List;

public class Parser {
        public String doTheCommand(String command, ZooImpl zoo) throws IllegalArgumentException {
                if (command == null) {
                        return "ERROR: The command is empty";
                }
                command.trim();
                String [] subcommands = command.split("\\s+");
                if (subcommands[0].equals("log")) {

                        List<InhibitionLog> history = zoo.getHistory();
                        StringBuilder logResult = new StringBuilder();
                        for (InhibitionLog log: history
                             ) {
                                logResult.append("Specie " + log.getAnimalSpecies().toString());
                                logResult.append(" Name " + log.getAnimalName());
                                logResult.append( " checkInDate " + log.getCheckInDate().toString());
                                if (log.getCheckOutDate() == null) {
                                        logResult.append(" CheckOutDate: still there");
                                }
                                else {
                                     logResult.append(" checkOutDate " + log.getCheckOutDate().toString());
                                }
                                logResult.append("\n");
                        }
                        return logResult.toString();
                }
                if (subcommands.length < 3) {
                        return "ERROR: Incorrect command";
                }
                if (subcommands[0].equals("check-in")) {
                        try {
                                switch (subcommands[1]) {
                                        case "Leon":
                                                zoo.checkInAnimal(new Leon(subcommands[2]));
                                                return "Successfully checked in Leon " + subcommands[2];
                                        case "Giraffe":
                                                zoo.checkInAnimal(new Giraffe(subcommands[2]));
                                                return "Successfully checked in Giraffe " + subcommands[2];
                                        case "Penguin":
                                                zoo.checkInAnimal(new Penguin(subcommands[2]));
                                                return "Successfully checked in Penguin " + subcommands[2];
                                        case "Squirell":
                                                zoo.checkInAnimal(new Squirell(subcommands[2]));
                                                return "Successfully checked in Squirell " + subcommands[2];
                                        default:
                                                return "ERROR: No such specie of an animal";
                                }
                        }
                        catch (IllegalArgumentException e) {
                                return "ERROR: " + e.getMessage();
                        }
                }
                else if (subcommands[0].equals("check-out")) {
                        try {
                                switch (subcommands[1]) {
                                        case "Leon":
                                                zoo.checkOutAnimal(new Leon(subcommands[2]));
                                                return "Successfully checked out Leon " + subcommands[2];
                                        case "Giraffe":
                                                zoo.checkOutAnimal(new Giraffe(subcommands[2]));
                                                return "Successfully checked out Giraffe " + subcommands[2];
                                        case "Penguin":
                                                zoo.checkOutAnimal(new Penguin(subcommands[2]));
                                                return "Successfully checked out Penguin " + subcommands[2];
                                        case "Squirell":
                                                zoo.checkOutAnimal(new Squirell(subcommands[2]));
                                                return "Successfully checked out Squirell " + subcommands[2];
                                        default:
                                                return "ERROR: No such specie of an animal";
                                }
                        }
                        catch (IllegalArgumentException e) {
                               return "ERROR: " + e.getMessage();
                        }
                }

                else {
                        return "ERROR: uknown command";
                }

        }
        
}
