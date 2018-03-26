import java.util.Scanner;

public class FeetMeterConversion {
    public static double FeetToMeter(double feet) {
        double meter = 3.048 * feet;
        return meter;
    }
    public static double MeterToFeet (double meter) {
double feet = (1/3.048)*meter;
return feet;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select = -1;
        do {
            System.out.println("1. Feet to meter.");
            System.out.println("2. Meter to feet");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.print("\nEnter feet: ");
                    double feet = input.nextDouble();
                    double meter = FeetToMeter(feet);
                    System.out.print("\n"+ feet+" = " + meter + " meter");
                    break;
                case 2:
                    System.out.print("\nEnter meter: ");
                    meter = input.nextDouble();
                    feet = MeterToFeet(meter);
                    System.out.print("\n" + meter + " = " + feet + " feet");
break;
                case 0:
                    System.exit(0);
            }
        } while (select != 0);
    }
}
