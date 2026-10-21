import java.util.Scanner;
public class siakadfor15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double nilai, tinggi = 0, rendah = 100;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + i + ": ");
            nilai = sc.nextDouble(); 
            if (nilai > tinggi) {
            tinggi = nilai;
            }
            if (nilai < rendah) {
            rendah = nilai;
            }
        }
        System.out.println("nilai tertinggi: " + tinggi);
        System.out.println("nilai terendah: " + rendah);

        sc.close();
    }
}
