public class PrintFDemo {
    public static void main(String[] args) {
        int i = 7;
        double d = 12.34;

        System.out.println("i = " + i + " and d = " + d);
        System.out.printf("i = %5d and d = %.2f", i, d);

        //

        int turnover = 3572;
        int expenses = 443;
        int extraAmount = 12;

        System.out.println();
        System.out.printf("Turnover    : %5d%n", turnover);
        System.out.printf("Expenses    : %5d%n", expenses);
        System.out.printf("Extra amount: %5d%n", extraAmount);
    }
}