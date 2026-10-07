import java.util.Scanner;
public class studikasus2_15 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nama Mahasiswa :");
    String nama = sc.nextLine();
    System.out.println("jenis kegiatan (BELMAWA, BAKORMA, Mandiri, PKM, atau Lainnya) :");
    String kegiatan = sc.nextLine();
    System.out.println("jumlah dokumen :");
    int dokumen = sc.nextInt();
    System.out.println(" peringkat juara :");
    int juara = sc.nextInt();
    if (kegiatan.equalsIgnoreCase("MANDIRI") || 
    kegiatan.equalsIgnoreCase("BELMAWA") || 
    kegiatan.equalsIgnoreCase("BAKORAMA")){
        if (dokumen >= 4 && dokumen < 5) {
            if (juara > 0 && juara <= 3){
                System.out.println("Status : selamat " + nama + " anda mendapatkan dana penghargaan" );
            }else {
                System.out.println("Status : maaf " + nama + "anda tidak memndapatkan dana penghargaan ");
            }
        } else if (dokumen < 4){
            int kurang = 4-dokumen;
            System.out.println("Status : maaf "+nama+", Dokumen anda kurang "+kurang+", maka dana penghargaan tidak diberikan");
        }else {
            System.out.println("Status : maaf "+nama+" dokumen nya kebanyakan, tolong input ulang");
        }
    }else if (kegiatan.equalsIgnoreCase("PKM")) {
        if (dokumen >= 4 && dokumen < 5){
            System.out.println("Apakah lolos pendanaan, (1/0) :");
            int DanaPkm = sc.nextInt();
            if (DanaPkm == 1){
                System.out.println("Status : selamat" + nama + " anda lolos pendanaan" );
            }else {
                System.out.println("Status : maaf" + nama + " anda tidak lolos pendanaan ");
            }
        }else if (dokumen < 4){
            int kurang1 = 4-dokumen;
            System.out.println("Status : maaf "+nama+", Dokumen anda kurang "+kurang1+", maka Anda tidak lolos pendanaan");
        }else {
            System.out.println("Status : maaf "+nama+" dokumen nya kebanyakan, tolong input ulang");
        }
    }else if(kegiatan.equalsIgnoreCase("lainnya")){
        System.out.println("Status : maaf "+nama+" untuk lomba lomba lain tidak mendapatkan apapun");
    } else {
        System.out.println("Status : mahasiswa kupu kupu kamu, enggak ikut kegiatan apapun !!!!");
    }
    
    sc.close();
}
}
