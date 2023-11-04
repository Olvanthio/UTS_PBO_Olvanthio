import java.util.Scanner;

class main {

    private double beratBadan;
    private double tinggiBadan;

    public main(double beratBadan, double tinggiBadan){
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    public double KalkulasiBBTB(){
        return beratBadan / (tinggiBadan * tinggiBadan);
    }

    public String Kesimpulan(){
        double BBTB = KalkulasiBBTB();

        if (BBTB >= 18.5 && BBTB <= 22.9){
            return "Mantap";
        } else if (BBTB > 22.9){
            return "Overweigth";
        } else{
            return "Underweight";
        }
    }

}

public class PBO_2{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input BeratBadan: ");
        double beratBadan = scanner.nextDouble();
        System.out.print("Input TinggiBadan: ");
        double tinggiBadan = scanner.nextDouble();

        main BBTB = new main (beratBadan, tinggiBadan);
        String Status = BBTB.Kesimpulan();

        System.out.println("Status BB: " + Status);

        scanner.close();
    }    
}
