import java.util.Scanner;
public class NusantaraPay15 {
    public static void main (String [] args ){
        Scanner sc = new Scanner (System.in);
        System.out.println( "masukkan status nasabah (Blacklisted/Suspicious/Save)");
        String statusakun = sc.nextLine();
        System.out.println("masukkan sisa saldo");
        long saldo = sc.nextLong();
        System.out.print("Masukkan jumlah transaksi: ");
        long transaksi = sc.nextLong();
        System.out.print("Apakah beda negara? (true/false): ");
        boolean bedanegara = sc.nextBoolean();
        System.out.print("Masukkan jam saat transaksi dilakukan (1-24, bulatkan jam tanpa sebutkan menit nya ) : ");
        int jam = sc.nextInt();

        System.out.println("Status transaksi  anda");
        if (statusakun.equalsIgnoreCase("BlackListed")) {
            System.out.println("REJECTED_BLACKLIST");
        } else if (transaksi > saldo) {
            System.out.println("REJECTED_SALDO");
        } else if (transaksi > 10000) {
            System.out.println("REJECTED_LIMIT");
        } else if (bedanegara && transaksi > 2000) {
            System.out.println("FLAGGED_FRAUD");
        } else if (jam >= 0 && jam <= 4 && transaksi > 1000) {
            System.out.println("REQUIRE_OTP_NIGHT");
        } else if (statusakun.equalsIgnoreCase("Suspicious") && transaksi > 500) {
            System.out.println("REQUIRE_OTP_SUSPICIOUS");
        } else {
            System.out.println("APRROVED");
        }
        sc.close();
    }
}