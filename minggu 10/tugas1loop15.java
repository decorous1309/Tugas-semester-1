import java.util.Scanner;
public class tugas1loop15 {
    public static void main(String[] args) {
        Scanner fr = new Scanner (System.in);
        System.out.print("Masukkan nilai n = ");
        
        int n = fr.nextInt();
        int i = 0;
        int total = 0;
            while (i <= n) {
                int chr = 1 ;
                int j = 0;
                while (j < i) {
                    System.out.print(chr);
                    j++;
                    chr++;
                }
            total += i;
            i++;
            System.out.println();
            }
    System.out.println("jumlah angka tercetak :"+ total);
     fr.close();


            
}
}