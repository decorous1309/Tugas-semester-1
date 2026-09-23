import java.util.Scanner;
public class pemilihanif15 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println( "--- Cetak KRS SIAKAD ---");
        System.out.print( "apakah ukt sudah lunas? (true/false): ");
        boolean uktPaid = sc.nextBoolean();
        if (uktPaid) {
        System.out.println("Pembayaran Ukt terverifikasi");
        System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        sc.close();
        }

    }
}