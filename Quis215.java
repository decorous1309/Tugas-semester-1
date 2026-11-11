import java.util.Scanner;
public class Quis215 {
    public static void main(String[] args) {
        Scanner fr = new Scanner (System.in);
        String nama = "Fahri Raihan Baldan";
        int noAbsen = 15;
        int k = noAbsen % 5;
        System.out.println("Nama : "+nama);
        System.out.println("Kode Personal K : " + k);
        System.out.println("Masukkan jumlah kurir : ");
        int jml_kurir = fr.nextInt();
        int i = 1;
        int jml_pkt_bsr = 0;
        int rt_total2 = 0;
        int ttl = 0;
        int total = 0;
        int rt_total = 0;
        int pr_kurir = 0;
        int pr_total = 0;
        while (i <= jml_kurir){
            System.out.println("Kurir " + i );
            System.out.println("Jumlah paket : ");
            int jml_paket = fr.nextInt();
            total = 0;
            for (int j = 1 ; j <= jml_paket ; j++){
                System.out.println("Berat paket " + j + " (kg):");
                int brt_paket = fr.nextInt();
                if ( brt_paket <= 1 ){
                    ttl = 8000 + k * 500;
                    total += ttl;
                    pr_total += ttl;
                } else if (brt_paket <= 10){
                    ttl = 20000 + k * 500;
                    total += ttl;
                    pr_total += ttl;
                } else {
                    ttl = 40000 + k * 500;
                    total += ttl ;
                    jml_pkt_bsr += 1;
                    pr_total += ttl;
                }
                rt_total = total / jml_paket;
                
            }
            System.out.print("Total : " + total + " | ");
            System.out.println("Rata Rata : " + rt_total2);
            if (rt_total > rt_total2){
                pr_total += rt_total2;
                pr_kurir += i;
                rt_total2 += rt_total;
            }
            
            i++;
        }
        System.out.println("Kurir Terbaik : " + pr_kurir);
        System.out.println("Ongkir Tertinggi : " + pr_total);
        System.out.println("Jumlah Paket Besar : " + jml_pkt_bsr);
        fr.close();
    }
}
