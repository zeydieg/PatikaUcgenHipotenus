import java.util.Scanner;

public class pratikucgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b;
        double c, u, alan;

        System.out.print("a kenarının değerini giriniz: ");
        a = inp.nextInt();

        System.out.print("b kenarının değerini giriniz: ");
        b= inp.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs uzunluğu:" + c);

        u = (a + b + c) / 2;
        System.out.println("Üçgenin çevresi:" + 2 * u);

        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.print("Üçgenin alanı:" + (alan * alan));
    }
}
