import java.util.Scanner;

public class RuangDarurat15 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.print("Masukkan usia pasien: ");
        byte usia = sc.nextByte();
        System.out.println("Masukkan SpO2 pasien (%) (1-100)");
        byte spo2 = sc.nextByte();
        System.out.print("Masukkan tekanan darah sistolik pasien: ");
        short tekananDarah = sc.nextShort();
        System.out.print("Masukkan suhu tubuh pasien (°C): ");
        byte suhuTubuh = sc.nextByte();
        System.out.print("Masukkan laju napas pasien permenit: ");
        byte lajuNapas = sc.nextByte();
        System.out.print("Apakah pasien memiliki riwayat komorbid? (true/false): ");
        boolean riwayatKomorbid = sc.nextBoolean();
        System.out.print("Apakah pasien sadar penuh? (true/false): ");
        boolean sadar = sc.nextBoolean();
        System.out.print("Masukkan sisa tempat tidur ICU: ");
        int sisaBedICU = sc.nextInt();

        System.out.println("---Lokasi Perawatan Pasien---");
        if (spo2 < 85 && sisaBedICU > 0 ) {
            System.out.println(" ICU");
        } else if (spo2 < 85 && sisaBedICU == 0) {
            System.out.println("UGD Ventilator Mobil");
        } else if (spo2 >= 85 && spo2 <90 || tekananDarah < 90 || tekananDarah > 180 || !sadar) {
            System.out.println("Resusitasi UGD");
        } else if ((spo2 >= 90 && spo2 <95 || suhuTubuh > 39) && riwayatKomorbid && usia >= 65 ){
            System.out.println(" HCU Isolasi");
        } else if (spo2 >= 90 && spo2 <95 || lajuNapas > 24) {
            System.out.println(" Rawat Inap Umum");
        } else {
            System.out.println(" Rawat Jalan");
        }
        sc.close();
    }
}