package enuminterface;

/**
 * Interface that specifies the rules for implementing a greeting class
 * @author Chandler Stevens - Team Aquamarine
 * @version 1.0
 * @since 2018-12-03
 * Interface Signature
 *     Access Visibility: public (required for all interfaces)
 *     Data Type: interface (required for all interfaces)
 *     Name: Hello
 *     Extends: None
 */
public interface Hello {
    /**
     * Field
     *     Access Visibility: public
     *     Constant: True
     *     Data Type: String
     *     Name: HELLO_WORLD
     *     Initial Value: "Hello World!"
     */
    public final String HELLO_WORLD = "Hello World!";
    /**
     * Method Signature
     *     Access Visibility: private (only allowed in JDK 9 and later)
     *     Static: True (only allowed in JDK 8 and later)
     *     Default: True (only allowed in JDK 8 and later)
     *     Return Data Type: void
     *     Name: helloWorld
     */
    private static void helloWorld() {
        System.out.println(HELLO_WORLD);
    }
    /**
     * Method Signature
     *     Access Visibility: public
     *     Static: True (only allowed in JDK 8 and later)
     *     Default: True (only allowed in JDK 8 and later)
     *     Return Data Type: void
     *     Name: display
     *     Parameters: String message
     *
     * @param message  the displayed message parameter
     */
    public static void display(String message) {
        System.out.println(message);
    }
    /**
     * Method Signature
     *     Access Visibility: public
     *     Static: False
     *     Default: False
     *     Return Data Type: String
     *     Name: askName
     *     Parameters: None
     *
     * @return the name of the user
     */
    public String askName();
}