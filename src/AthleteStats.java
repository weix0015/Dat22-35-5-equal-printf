import java.util.Scanner;

public class AthleteStats {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String navn;
        double seconds;
        double miliseconds;
        double meter;
        double cm;

        System.out.print("Enter athlete's name: ");
        navn = in.nextLine();

        System.out.print("Enter total numbers of seconds (as a double): ");
        seconds = in.nextDouble();

        System.out.print("Enter total number of meters (as a double): ");
        meter = in.nextDouble();

        miliseconds = (seconds*1000)%1000;
        cm = (meter*100)%100;

        System.out.println("Stats of " + navn + ":");
        System.out.print("Time: " + seconds + " seconds and ");
        System.out.print(miliseconds + " milliseconds");
        System.out.println("Distance: " + meter + " meters and ");
        System.out.println(cm + " cm");

    }
}
