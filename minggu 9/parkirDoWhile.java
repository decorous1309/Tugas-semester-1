import java.util.Scanner;
public class parkirDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jenis, durasi, total = 0 ;
        int i = 1;
        do {
            System.out.println("input jenis kendaraan ke-"+i+" :");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2){
                System.out.println("input durasi ");
                durasi = sc.nextInt();
                if (jenis == 1){
                    total += durasi*3000;
                }else {
                    total += durasi*2000;
                }
            }else if ( jenis > 2) {
                System.out.println("kendaraan tidak teridentifikasi!!!");
            }
            i++;
        } while (jenis != 0);
        System.out.println("jumlah kendaraan yang parkir: "+ i);
        System.out.println("total biaya parkir :"+ total);
        sc.close();
    }
}