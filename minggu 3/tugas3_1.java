import java.util.Scanner;

public class tugas3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga;
        int uangmuka;
        int bulan;
        double bunga=0.2f;
        double hargabersih;
        double cicilan;
        System.out.println("masukkan harga barang, uang muka, dan jumlah bulan :");
        harga = sc.nextInt();
        uangmuka = sc.nextInt();
        bulan = sc.nextInt();
        hargabersih = harga - uangmuka;
        cicilan = (hargabersih / bulan) + ((hargabersih/bulan) * bunga);
        System.out.println("jumlah yang harus anda bayar adalah : " + cicilan);
        sc.close();
    }
}