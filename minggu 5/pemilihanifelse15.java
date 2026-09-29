import java.util.Scanner ;
public class pemilihanifelse15 {
    public static void main (String []args ) {
       Scanner sc  = new Scanner (System.in); 
       System.out.println( "--- Print KRS SIAKAD ---");
       System.out.print( "masukkan semester saai ini: ");
       int semester = sc.nextInt();

        if (semester == 1) {
        System.out.println( "KRS Semester 1 di tampilkan");
        } else if (semester == 2){
        System.out.println( "KRS semester 2 di tampilkan");
        } else if (semester == 3) {
        System.out.println("KRS semester 3 di tampilkan");
        }else if(semester == 4){
        System.out.println( "KRS semester 4 di tampilkan");
        }else if(semester == 5) {
        System.out.println( "KRS semester 5 di tampilkan");
        }else if(semester == 6) {
        System.out.println( "KRS semester 6 di tampilkan");
        }else if(semester == 7) {
        System.out.println( "KRS semester 7 di tampilkan");
        }else if(semester == 8 ){
        System.out.println( "KRS semester 8 ditampilkan");
        } else {
        System.out.println( "semester tidak valid");
        }
        sc.close();
}
    }
