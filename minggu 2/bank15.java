import java.util.Scanner;
public class bank15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jmltabungan, lamamenabung;
        double prosentasebunga=0.02,bunga,jmltabunganakhir;
        System.out.print("Masukkan jumlah tabungan: ");
        jmltabungan = sc.nextInt();
        System.out.print("Masukkan lama menabung anda: ");
        lamamenabung = sc.nextInt();
        bunga= lamamenabung * jmltabungan * prosentasebunga;
        jmltabunganakhir = jmltabungan + bunga ;
        System.out.println("jumlah bunga anda = "+ bunga);
        System.out.println("jumlah tabungan akhir anda = "+ jmltabunganakhir);
        sc.close();
    }
}