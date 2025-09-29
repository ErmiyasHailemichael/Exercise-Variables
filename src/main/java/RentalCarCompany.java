import java.util.Scanner;

public class RentalCarCompany {
    static Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {
        String pickupDate = pickUpDate();
        System.out.println("Pickup Date: " + pickupDate);

        int days = numberOfRentalDays();
        System.out.println("Number of Rental Days: " + days);

        boolean toll = isElectronicToll();
        System.out.println("Electronic Toll: " + toll);

        boolean isGPS = isGPS();
        System.out.println("GPS: " + isGPS);

        boolean isRoadside = isRoadside();
        System.out.println("Roadside: " + isRoadside);

        int age = getAge();
        System.out.println("Age: " + age);
    }
    public static String pickUpDate() {
        System.out.println("What is pick up date?");
        return scanner.nextLine();
    }

    public static int numberOfRentalDays() {
        System.out.println("What is number of rental days?");
        int numberOfRentalDays = scanner.nextInt();
        scanner.nextLine(); // clear newline
        return numberOfRentalDays;
    }

    public static boolean isElectronicToll() {
        System.out.println("Do you want an electronic toll tag at $3.95/day? (yes/no)");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }
    public static boolean isGPS() {
        System.out.println("Do you want a GPS at $2.95/day? (yes/no)");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }

    public static boolean isRoadside() {
        System.out.println("Do you want roadside assistance at $3.95/day? (yes/no)");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }

    public static int getAge() {
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        scanner.nextLine(); // clear newline
        return age;
    }
}
