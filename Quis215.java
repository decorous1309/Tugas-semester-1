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
        while (i <= jml_kurir){
            System.out.println("Jumlah paket : ");
            int jml_paket = fr.nextInt();
            int ttl = 0;
            int total = 0;
            int rt_total = 0;
            for (int j = 1 ; j <= jml_paket ; j++){
                System.out.println("Berat paket " + j + " (kg):");
                int brt_paket = fr.nextInt();
                if ( brt_paket <= 1 ){
                    ttl = 8000 * k * 500;
                    total += ttl;
                } else if (brt_paket <= 10){
                    ttl = 20000 * k * 500;
                    total += ttl;
                } else {
                    ttl = 40000 * k * 500;
                    total += ttl ;
                    jml_pkt_bsr += 1;
                }
                rt_total = jml_paket / total;
                rt_total2 += rt_total ;
                j++;
            }
            System.out.println("Total : " + total);
            System.out.println("Rata Rata : " + rt_total2);
            i++;
        }
        System.out.println("Kurir Terbaik : ");
        System.out.println("Ongkir Tertinggi : ");
        System.out.println("Jumlah Paket Besar : " + jml_pkt_bsr);
        fr.close();
    }
}
