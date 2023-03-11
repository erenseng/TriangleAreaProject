import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create variables
        double a, b, c, u, area;
        /* a -> first side, b-> second side, c-> third side, u = semi-peremeter */

        // create scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci kenar: ");
        a = input.nextDouble();
        System.out.print("İkinci kenar: ");
        b = input.nextDouble();
        System.out.print("Üçüncü kenar: ");
        c = input.nextDouble();

        // calculations
        u = (a + b + c) / 2;
        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        //output
        System.out.println("Alanı : " + area);
    }
}