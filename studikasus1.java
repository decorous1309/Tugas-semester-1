import java.util.Scanner;
public class studikasus1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long gaji = 5000000;
        long tunjangan = 100000;
        int anak = 4;
        System.out.print( "Masukkan jumlah anak anda:");
        anak = sc.nextInt();
        System.out.print( "Masukkan gaji pokok anda:");
        gaji = sc.nextLong();
        System.out.print( "Masukkan tunjangan anda:");
        tunjangan = sc.nextLong();
        double danapensiun = 0.1*gaji;
        double totalgaji = gaji + (tunjangan * anak) - danapensiun;
        System.out.println("Gaji pokok anda adalah = "+ totalgaji);
    sc.close();
    }
}