import java.util.Scanner;
public class tugasparkir15 {
    public static void main ( String [] args ){
        Scanner sc = new Scanner (System.in);
         long tarif = 2000;
         long jam ;
         long total ;
         
         System.out.println("masukakn berapa lama jam parkir?");
         jam = sc.nextInt();

         if ( jam <= 2 ){
            total = tarif ;
         } else {
            total = tarif + (jam - 2) * 1000;
         }
         System.out.println(" bayar parkir" + total);
         sc.close();
    }
}