package CSE1325.Assignment0;

import java.util.*;

/**
 * This program has a few issues and will not compile.
 * It should read in information about a Creature.
 * @version 1.0
 * @author Alex Dillhoff
 */
public class Creature {
    public static void main(String[] args) {
        String name = "";
        int level = 0;

        // Check if Creature information was provided from the command line
        if (args.length() = 2) {
            name = args[0];
            level = Integer.parseInt(args[1]);
        } else {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter a name for the creature: ");
            name = in.nextLine();

            System.out.print("Enter the creature's level: ");
            level = in.nextInt();
        }

        String levelString = String.format("Level:\t %d", level);
        System.out.println("Name:\t " + name)
        System.out.println(levelString);
    }
}
