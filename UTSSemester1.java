import java.util.Scanner;
public class UTSSemester1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Mode Level yang dimainkan :");
    String modelvl = sc.nextLine();
    System.out.println("jumlah zombie yang dibunuh :");
    float jml_zombie = sc.nextFloat();
    float bonus = 0;
    float tot_koin = 0;
    float koin_dsr = 0;

    if (modelvl.equalsIgnoreCase("Siang")){
        float koin_zombie = 10;
        if (jml_zombie <= 10){
            if (jml_zombie < 0){
                System.out.println("tidak valid");
            }else {
                koin_dsr = koin_zombie*jml_zombie;
                System.out.println("koin dasar" + koin_dsr);
                System.out.println("bonus = " + bonus);
                System.out.println("Total Koin :" + tot_koin );
            }
        } else if (jml_zombie <= 25){
            koin_dsr = koin_zombie*jml_zombie;
            bonus = koin_dsr*10/100;
            tot_koin = koin_dsr + bonus;
            System.out.println("koin dasar" + koin_dsr);
            System.out.println("bonus = 10% " +"("+ bonus +")");
            System.out.println("Total Koin :" + tot_koin);
        } else if (jml_zombie >= 26){
            koin_dsr = koin_zombie*jml_zombie;
            bonus = koin_dsr*25/100;
            tot_koin = koin_dsr + bonus;
            System.out.println("koin dasar" + koin_dsr);
            System.out.println("bonus = 25%" +"("+ bonus +")");
            System.out.println("Total Koin :" + tot_koin);
        }
    } else if (modelvl.equalsIgnoreCase("malam")){
        float koin_zombie = 15;
        if (jml_zombie <= 10){
            if (jml_zombie < 0){
                System.out.println("tidak valid");
            }else {
                koin_dsr = koin_zombie*jml_zombie;
                System.out.println("koin dasar" + koin_dsr);
                System.out.println("bonus = " + bonus );
                System.out.println("Total Koin :" + tot_koin);
            }
        } else if (jml_zombie <= 25){
            koin_dsr = koin_zombie*jml_zombie;
            bonus = koin_dsr*15/100;
            tot_koin = koin_dsr + bonus;
            System.out.println("koin dasar" + koin_dsr);
            System.out.println("bonus = 15% " +"("+ bonus +")");
            System.out.println("Total Koin :" + tot_koin);
        } else if (jml_zombie >= 26){
            if (jml_zombie >= 40){
                koin_dsr = koin_zombie*jml_zombie;
                bonus = koin_dsr*30/100;
                tot_koin = koin_dsr + bonus + 100;
                System.out.println("koin dasar" + koin_dsr);
                System.out.println("bonus = 30% " +"("+ bonus +")");
                System.out.println("selamat anda mendapatkan Hadiah Trofi Malam (+ 100 koin)");
                System.out.println("Total Koin :" + tot_koin);
            }else {
                koin_dsr = koin_zombie*jml_zombie;
                bonus = koin_dsr* 30/100;
                tot_koin = koin_dsr + bonus;
                System.out.println("koin dasar" + koin_dsr);
                System.out.println("bonus = 30% " +"("+ bonus +")");
                System.out.println("Total Koin :" + tot_koin);
            }
        }
    }else {
        System.out.println("tidak valid");
    }

    sc.close();
}
}