package enuminterface;

/**
 * Import the Scanner library for reading console input
 */
import java.util.Scanner;

/**
 * Class that represents a welcoming conversation
 * @author Chandler Stevens - Team Aquamarine
 * @version 1.0
 * @since 2018-12-03
 * Class Signature
 *     Access Visibility: public
 *     Data Type: class (required for all classes)
 *     Name: Welcome
 *     Extends: None
 *     Implements: PetPreference, VehiclePreference
 */
public class Welcome implements PetPreference, VehiclePreference {
    /**
     * Field
     *     Access Visibility: private
     *     Constant: False
     *     Data Type: String
     *     Name: name
     *     Initial Value: None
     */
    private String name;
    /**
     * Method Signature
     *     Access Visibility: public
     *     Static: False
     *     Default: False
     *     Return Data Type: String
     *     Name: askName
     */
    @java.lang.Override
    public String askName() {
        Hello.display("Welcome! What is your name?");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        return name;
    }
    /**
     * Method Signature
     *     Access Visibility: public
     *     Static: False
     *     Default: False
     *     Return Data Type: Welcome (constructor)
     *     Name: Welcome
     */
    public Welcome() {
        name = askName();
        Scanner in = new Scanner(System.in);
        Hello.display("Well, nice to meet you "+name+"!" +
                "\nWhat is your favorite kind of pet?");
        Pet favoritePet = Pet.dog;
        Hello.display("");
        favoritePet = Pet.valueOf(in.next());
        favoritePet.provideFact();
        Hello.display("\nHey, "+name+"! What is your favorite kind of vehicle?");
        Vehicle favoriteVehicle = Vehicle.spaceship;
        Hello.display("");
        favoriteVehicle = Vehicle.valueOf(in.next());
        favoriteVehicle.provideFact();
        Hello.display("Alright, goodbye "+name+"! Until next time!");
        in.close();
    }
}