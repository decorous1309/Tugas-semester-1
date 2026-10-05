import java.util.Scanner;
public class calonasisten15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("apakah mahasiswa aktif (true/false)?");
        boolean status = sc.nextBoolean();
        System.out.println(" apakah siswa memiliki kompen (true/false)?");
        boolean kompen = sc.nextBoolean();
        System.out.println("berapa nilai dasar pemograman mahasiswa (1-100)?");
        int nilai = sc.nextInt();
        System.out.println(" apakah siswa memiliki sertifikat kompetensi pemograman ?");
        boolean sertif = sc.nextBoolean();
        System.out.println(" berapa nilai wawancara mahasiswa (1-100)? ");
        int wawancara = sc.nextInt();

        if (status && !kompen) {
            if (nilai > 80 || sertif){
                if ( wawancara > 75){
                    System.out.println(" selamaat anda di terima sebagai asisten");
                }else {
                    System.out.println("maaf nilai wawancara tidak memadai");
                }
            } else {
                System.out.println(" Nilai kurang memadai atau tidak memiliki sertifikat");
            }
        } else {
            System.out.println("Bukan mahasiswa aktif");
        }
        sc.close();
    }
}