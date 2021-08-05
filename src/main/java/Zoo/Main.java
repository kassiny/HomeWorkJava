package Zoo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Parser parser = new Parser();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(parser.doTheCommand(scanner.nextLine(),ZooImpl.getZoo()));
        }


    }
}
