public class ReceiptPrinter {
    public static void main(String[] args) {
        int uniqueNumber = 723;
        String date = "February 7, 2022";
        String name = "Cash Ripper";
        double amount = 234.43;
        String methodOfPayment = "Cash";
        String signature = "The M. Anager";

        System.out.printf("%n%55s", "Unique Number: " + uniqueNumber);
        System.out.printf("%n%55s", "Date: " + date);
        System.out.printf("%n");
        System.out.printf("%nName%51s", name);
        System.out.printf("%nAmount%49.2f", amount);
        System.out.printf("%nMethod of payment%38s", methodOfPayment);
        System.out.println();
    }
}