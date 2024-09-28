import java.util.Scanner;

public class Harmoni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir pozitif tam sayı girin: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Lütfen pozitif bir tam sayı girin.");
            return;
        }

        double harmonikSeri = 0.0;

        System.out.print("Harmonik Seri: ");
        for (int i = 1; i <= n; i++) {
            harmonikSeri += 1.0 / i;
            System.out.print("1/" + i);
            if (i < n) {
                System.out.print(" + ");
            }
        }

        System.out.println(" = " + harmonikSeri);
        scanner.close();
    }
}
