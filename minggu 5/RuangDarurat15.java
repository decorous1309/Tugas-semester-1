import java.util.Scanner;

public class RuangDarurat15 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.print("Masukkan sisa tempat tidur ICU: ");
        int sisabedicu = sc.nextInt();
        System.out.print("Masukkan usia pasien: ");
        byte usia = sc.nextByte();
        System.out.println("Masukkan SpO2 pasien (%) (1-100)");
        byte spo2 = sc.nextByte();
        System.out.print("Masukkan tekanan darah sistolik pasien (normal lebih dari 90 kurang dari 180): ");
        short tekananDarah = sc.nextShort();
        System.out.print("Masukkan suhu tubuh pasien (°C) (suhu normal dibawah 39): ");
        byte suhuTubuh = sc.nextByte();
        System.out.print("Masukkan laju napas pasien permenit (jika normal lebih dari 24): ");
        byte lajunapas = sc.nextByte();
        System.out.print("Apakah pasien memiliki riwayat komorbid? (true/false): ");
        boolean riwayatkomorbid = sc.nextBoolean();
        System.out.print("Apakah pasien sadar penuh? (true/false): ");
        boolean sadar = sc.nextBoolean();
        

        
        if (spo2 < 85 && sisabedicu > 0 ) {
            System.out.println(" ICU");
        } else if (spo2 < 85 && sisabedicu == 0) {
            System.out.println("UGD Ventilator Mobil");
        } else if (spo2 >= 85 && spo2 <90 || tekananDarah < 90 || tekananDarah > 180 || !sadar) {
            System.out.println("Resusitasi UGD");
        } else if ((spo2 >= 90 && spo2 <95 || suhuTubuh > 39) && riwayatkomorbid && usia >= 65 ){
            System.out.println(" HCU Isolasi");
        } else if (spo2 >= 90 && spo2 <95 || lajunapas > 24) {
            System.out.println(" Rawat Inap Umum");
        } else {
            System.out.println(" Rawat Jalan");
        }
        sc.close();
    }
}