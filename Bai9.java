import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nhap so nguyen n: ");
        int n = scanner.nextInt();
        System.out.printf(" ");
        System.out.printf("Giai thua " + n + "! bang: ");
        int giaithua = 1;
        for (int i = 1; i <= n; i++) {
            giaithua *= i;
        }
        System.out.printf(String.valueOf(giaithua));
    }
}
