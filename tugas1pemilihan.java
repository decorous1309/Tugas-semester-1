import java.util.Scanner;
public class tugas1pemilihan  {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println( "--- Cetak KRS SIAKAD ---");
        System.out.print( "apakah ukt sudah lunas? (true/false): ");
        boolean uktPaid = sc.nextBoolean();
      
        String hasil = (uktPaid) ? " Pembayaran Ukt terverifikasi \n Silahkan cetak KRS dan minta tanda tangan DPA" : "";
        System.out.println (hasil);
    }
}