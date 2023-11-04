import java.util.Scanner;

class PBO_1 {

    private int awalJam, awalMenit, awalDetik;
    private int akhirJam, akhirMenit, akhirDetik;
    
    public PBO_1 (int awalJam, int awalMenit, int awalDetik, int akhirJam, int akhirMenit, int akhirDetik){
        this.awalJam = awalJam;
        this.awalMenit = awalMenit;
        this.awalDetik = awalDetik;
        this.akhirJam = akhirJam;
        this.akhirMenit = akhirMenit;
        this.akhirDetik = akhirDetik;
    }

    public int HitungDurasiPercakapan(){
        return (akhirJam - awalJam) * 3600 + (akhirMenit - awalMenit) * 60 + (akhirDetik - awalDetik);
    }

    public int BiayaPercakapan(){
        return (HitungDurasiPercakapan() / 5) * 150;
    }

    public void TampilanHasil(){
        System.out.println("Durasi Percakapan: " + HitungDurasiPercakapan() + " detik");
        System.out.println("Biaya Percakapan: Rp. " + BiayaPercakapan());
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan awal jam, awal menit, awal detik (pake spasi): ");
        int awalJam = scanner.nextInt();
        int awalMenit = scanner.nextInt();
        int awalDetik = scanner.nextInt();

        System.out.print("Masukkan akhir jam, akhir menit, akhir detik (pake spasi): ");
        int akhirJam = scanner.nextInt();
        int akhirMenit = scanner.nextInt();
        int akhirDetik = scanner.nextInt();

        PBO_1 Percakapan = new PBO_1(awalJam, awalMenit, awalDetik, akhirJam, akhirMenit, akhirDetik);
        Percakapan.TampilanHasil();

        scanner.close();
    }
}
