import java.util.Scanner;
public class tugasmat1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean p ;
        boolean q ;
        int nilai ;
        int hadir ;
        System.out.print("Masukkan Nilai : ");
        nilai = sc.nextInt();
        System.out.print("Masukkan Kehadiran : ");
        hadir = sc.nextInt();
        if (nilai >= 60) {
            p = true;
        } else {
            p = false;
        }
        if (hadir >= 80) {
            q = true;
        } else {
            q = false;
        }
        if (p && q) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (!p || !q) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        sc.close();
    }
}