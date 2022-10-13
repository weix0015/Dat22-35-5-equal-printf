public class TypeCastingDemo {
    public static void main(String[] args) {
        double d = 17.8;
        int i = 8;

        System.out.println("double: " + (int)d);
        System.out.println("int: " + (double)i);

        // Eksplicit/implicit typecasting

        int stortTal = 25;
        int lilleTal = 4;

        System.out.println((double) stortTal / lilleTal);

        double stortTal2 = 25;
        double lilleTal2 = 4;

        System.out.println((int)(stortTal2 / lilleTal2));
    }
}
