import java.util.Scanner;
public class studikasus1_15 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hargapercup = 18000;
    System.out.print("Masukkan jumlah cup yang dibeli: ");
    int jumlah_cup = sc.nextInt();
    System.out.println("masukkan jumlah uang yang di bayar: ");
    int harga_bayar = sc.nextInt();
    int total_bayar = hargapercup*jumlah_cup;
    int diskon = 0;
    if (total_bayar >= 100000){
        diskon = total_bayar*10/100;
        total_bayar = total_bayar- diskon;
    }
    System.out.println("Total harga:" + total_bayar);
    System.out.println("diskon :" + diskon);
    System.out.println("Total bayar :"+ harga_bayar);
    if (harga_bayar >= total_bayar){
        int kembalian = harga_bayar - total_bayar;
        System.out.println( "kembalian anda :" + kembalian );
    }else {
        int kurang = total_bayar - harga_bayar;
        System.out.println("uang ada kurang:"+ kurang );
    }
    
    sc.close();
}
}
