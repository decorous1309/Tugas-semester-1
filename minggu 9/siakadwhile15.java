import java.util.Scanner;
public class siakadwhile15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml_mahasiswa = sc.nextInt();
        int i = 0;
        while (i < jml_mahasiswa) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
        int nilai = sc.nextInt();
        if (nilai < 0 || nilai > 100) {
        System.out.println("nilai tidak valid. Pmasukkan nilai yang valid (1-100)");
        continue;
        }
        if (nilai > 80 && nilai <= 100) {
        System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
        } else if (nilai > 73 && nilai <= 80) {
        System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
        } else if (nilai > 65 && nilai <= 73) {
        System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
        } else if (nilai > 60 && nilai <= 65) {
        System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
        } else if (nilai > 50 && nilai <= 60) {
        System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
        } else if (nilai > 39 && nilai <= 50) {
        System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
         } else {
        System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
         }
        i++;
        }
        sc.close();
    }
}