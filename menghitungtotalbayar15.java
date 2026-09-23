import java.util.Scanner;

public class menghitungtotalbayar15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double harga;
        double jml_bayar;
        double potongan;
        double diskon=0.15f;
        harga = sc.nextInt();
        potongan = harga * diskon;
        jml_bayar = harga - potongan;
        System.out.println("jumlah yang harus anda bayar adalah : " + jml_bayar);
        sc.close();
    }
}