import java.util.Scanner;

class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double LuasDariLingkaran() {
        return Math.PI * Math.pow(jariJari, 2);
    }

    public double KelilingDariLingkaran() {
        return 2 * Math.PI * jariJari;
    }
}

public class PBO_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input r lingkaran: ");
        double jariJari = scanner.nextDouble();

        if (jariJari < 3) {
            System.out.println("Jari-jari nya kekecilan BLOK! gedein dikit napa, PELIT AMAT SEH.");
            return;
        }

        Lingkaran lingkaran = new Lingkaran(jariJari);

        double luas = lingkaran.LuasDariLingkaran();
        double keliling = lingkaran.KelilingDariLingkaran();

        System.out.println("L Lingkaran: " + luas);
        System.out.println("K Lingkaran: " + keliling);

        scanner.close();
    }
}