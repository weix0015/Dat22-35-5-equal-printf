public class EqaulsDemo {

    public static void main(String[] args) {
        String tal1 = "Syv";
        String tal2 = "Tolv";

        // Vi bruger == ved SIMPLE datatyper - fx tal1 == tal2
        // ... men fx ved strings, bruger vi equals()
        if (tal1.equals(tal2)) {
            System.out.println("Ens!");
        } else {
            System.out.println("Ikke ens!");
        }
    }
}
