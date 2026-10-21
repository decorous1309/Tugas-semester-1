import java.util.Scanner;
public class tiketBioskop15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double totalharga,diskon;
        double hargaTiket = 50000;
        int tot_harga = 0;
        int tot_tiket = 0;
        System.out.println("\s\s!!!!jangan memasukkan angka kurang dari 0 dan 0!!!!");
        System.out.println("!!!!sistem akan erorr jika menginput angka tersebut!!!!");
        System.out.println("\t\s\s!!!!jika error kilik ctrl + c!!!!");
        System.out.println("jumlah pelanggan dalam satu hari :");
        int pelanggan = sc.nextInt();
        for (int i = 1; i <= pelanggan; i++){
            System.out.println("masukkan jumlah tiket :");
            double jml_tiket = sc.nextInt();
            if (jml_tiket <= 4){
                if (jml_tiket <= 0){
                    int ii = 1;
                    while (true){
                        System.out.print(" ERORR ERORR ");
                        if (ii == 1000){
                            break;
                        }
                        ii++;
                    }
                    System.out.println("maaf sistem erorr, silahkan input yang benar");
                    continue;
                }else{
                System.out.println("tidak dapat diskon");
                }
                diskon = 0;
            } else if (jml_tiket < 10){
                System.out.println("diskon 10%");
                diskon = 0.1;
            } else {
                System.out.println("diskon 10 %");
                diskon = 0.15;
            }
            totalharga = (hargaTiket-diskon*hargaTiket) * jml_tiket;
            System.out.println("harga total tiket "+ totalharga);
            tot_tiket += jml_tiket;
            tot_harga += totalharga;
        } if (pelanggan <= 0 ){
            int iii = 1;
            while (true){
                 System.out.print(" ERORR ERORR ");
                if (iii == 1000){
                break;
                }
                iii++;
                }
                System.out.println(" maaf sistem erorr, silahkan input yang benar"); 
        }  else {
        System.out.println("total tiket dalam satu hari: "+ tot_tiket);
        System.out.println("total penjualan dalam satu hari: "+ tot_harga);
        }

        sc.close();
    }
}