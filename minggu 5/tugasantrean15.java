import java.util.Scanner;
public class tugasantrean15 {
    public static void main ( String []args){
        Scanner input = new Scanner ( System.in );
        System.out.println("masukkan huruf loket (a-d) ");
        char loket = input.next().charAt(0); 
        switch (loket) {
        case 'a':
        System.out.println( "legalisir ijazah");
        break;
        case 'b':
        System.out.println( "Surat keterangan aktif kuliah");
        break;
        case 'c':
        System.out.println("Pembayaran Ukt");
        break;
        case 'd':
        System.out.println( "Pengajuan cuti Akademik");
        break;
        default:
        System.out.println  ("salah input");
        break;
        }
       input.close();
    }
}
