package enuminterface;

/**
 * Interface that specifies the rules for implementing a favorite pet class
 * @author Chandler Stevens - Team Aquamarine
 * @version 1.0
 * @since 2018-12-03
 * Interface Signature
 *     Access Visibility: public (required for all interfaces)
 *     Data Type: interface (required for all interfaces)
 *     Name: PetPreference
 *     Extends: Hello
 */
public interface PetPreference extends Hello {
    /**
     * Enumeration Signature
     *     Access Visibility: public (required for all enumerations)
     *     Data Type: enum (required for all enumerations)
     *     Name: Pet
     *     Values: dog, cat, bird, lizard, fish
     */
    public enum Pet {
        dog, cat, bird, lizard, fish;
        /**
         * Method Signature
         *     Access Visibility: private
         *     Static: False
         *     Default: False (required for enumeration constructors)
         *     Return Data Type: Pet (constructor)
         *     Name: Pet
         */
        private Pet()
        {
            System.out.print("  " + this.toString());
        }
        /**
         * Method Signature
         *     Access Visibility: public
         *     Static: False
         *     Default: False
         *     Return Data Type: void
         *     Name: provideFact
         */
        public void provideFact() {
            System.out.print("The average pet "+this.toString());
            switch (this) {
                case dog:
                    Hello.display(" sleeps an average of" +
                            " 12-14 hours a day!");
                    break;
                case cat:
                    Hello.display(" sleeps an average of" +
                            " 12-16 hours a day!");
                    break;
                case bird:
                    Hello.display(" body temperature is" +
                            " about 105 °F!");
                    break;
                case lizard:
                    Hello.display(" tongue is about twice" +
                            " its body length!");
                    break;
                default:
                    Hello.display(" was harvested in Asia," +
                            " Africa, Central America, or South America!");
            };
        }
    }
}