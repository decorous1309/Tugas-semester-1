import java.util.Scanner;

public class Kafe15 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    Menu("Andi", true);

    System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
    int pilihanMenu = sc.nextInt();
    System.out.print("Masukkan jumlah item yang ingin Anda pesan: ");
    int BanyakItem = sc.nextInt();
    int totalBayar = HitungTotalHarga15(pilihanMenu, BanyakItem);
    System.out.println("Total harga untuk pesanan Anda adalah: Rp " + totalBayar);
}

public static void Menu(String customerName, boolean isMember) {
    System.out.println("Welcome, " + customerName + "!");
    
    if (isMember) {
        System.out.println("You are a member, enjoy 10% off every purchase!");
    }

    System.out.println("===== MENU RESTO KAFE =====");
    System.out.println("1. Kopi Hitam - Rp 15,000");
    System.out.println("2. Cappuccino - Rp 20,000");
    System.out.println("3. Latte - Rp 22,000");
    System.out.println("4. Teh Tarik - Rp 12,000");
    System.out.println("5. Roti Bakar - Rp 10,000");
    System.out.println("6. Mie Goreng - Rp 18,000");
    System.out.println("================================");
    System.out.println("Silahkan Pilih Menu yang anda Inginkan.");
}
public static int HitungTotalHarga15(int menuChoice, int itemCount) {
    int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
    int hargaTotal = hargaItems[menuChoice - 1] * itemCount;
    return hargaTotal;
}
}