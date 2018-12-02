package enuminterface;

/**
 * Interface that specifies the rules for implementing a favorite vehicle class
 * @author Chandler Stevens - Team Aquamarine
 * @version 1.0
 * @since 2018-12-03
 * Interface Signature
 *     Access Visibility: public (required for all interfaces)
 *     Data Type: interface (required for all interfaces)
 *     Name: VehiclePreference
 *     Extends: Hello
 */
public interface VehiclePreference extends Hello {
    /**
     * Enumeration Signature
     *     Access Visibility: public (required for all enumerations)
     *     Data Type: enum (required for all enumerations)
     *     Name: Vehicle
     *     Values: car, boat, submarine, train, airplane, spaceship
     */
    public enum Vehicle {
        car, boat, submarine, train, airplane, spaceship;
        /**
         * Method Signature
         *     Access Visibility: private
         *     Static: False
         *     Default: False (required for enumeration constructors)
         *     Return Data Type: Vehicle (constructor)
         *     Name: Vehicle
         */
        private Vehicle()
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
            System.out.print("The fastest " + this.toString() + " was the ");
            switch (this) {
                case car:
                    Hello.display("Thrust SSC at 763 mph!");
                    break;
                case boat:
                    Hello.display("Spirit of Australia at 318 mph!");
                    break;
                case submarine:
                    Hello.display("Alfa-class at 46 mph!");
                    break;
                case train:
                    Hello.display("Series L0 (A07) at 375 mph!");
                    break;
                case airplane:
                    Hello.display("Lockheed SR-71A Blackbird at 2,193 mph!");
                    break;
                default:
                    Hello.display("Parker Solar Probe at 213,242 mph!");
            };
        }
    }
}