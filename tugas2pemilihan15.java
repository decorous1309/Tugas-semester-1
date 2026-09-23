import java.util.Scanner;
public class tugas2pemilihan15 {
    public static void main {
        Scanner sc = new Scanner (System.in);
        int sks;
        System.out.println(" masukkan jumlah sks :");
        sks = sc.nextInt();

        if (sks > 24){
            System.out.println (" melebihi batas ");
        }else {
            System.out.println ( " KRS valid")
        }
        sc.close();
    }
}