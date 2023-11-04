    import java.util.Scanner;

    public class PBO_3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] jumlahbilangan = new int[10];
            int total = 0;

            for (int i = 0; i < 10; i++) {
                System.out.print("Bilangan ke-" + (i + 1) + ": ");
                jumlahbilangan[i] = scanner.nextInt();
                total += jumlahbilangan[i];
            }

            System.out.println("Jumlah 10 bilangan adalah: " + total);

            scanner.close();
        }
    }
