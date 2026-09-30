import java.util.Scanner;
public class nestedujianskripsi15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String pesan;
        System.out.println("apakah mahasiswa sudah bebas kompen ? (ya/tidak)");
        String Bebaskompen = sc.nextLine().trim();
        System.out.println("masukkan jumlah log bimbingan pembinmbing 1:");
        int bimbingan1 = sc.nextInt();
        System.out.println("masukkan jumlah log bimbingan pembimbing 2:");
        int bimbingan2 = sc.nextInt();
        if (Bebaskompen.equalsIgnoreCase("ya")) {
        if (bimbingan1 >= 8 && bimbingan2>= 4) {
        pesan = "Semua persyaratan terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
        } else if (bimbingan1 < 8 && bimbingan2 < 4) {
        pesan = "gagal ! log pembimbingan p1 kurang dari 8 kali dan log pembimbingan p2 kurang dari 4 kali";
         } else if (bimbingan1 < 8) {
         pesan = "gagal! log pembimbingan p1 belum mencapai 8 kali";
        } else {
        pesan = "gagal! log pembimbingan p2 belum mencapai 4 kali";
        }
        } else {
         pesan = "gagal, mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
        sc.close();
    }
}