//Fahri Raihan Baldan (TI-!D)
import java.util.Scanner; //mengimport libary yang berisis input untuk codingan java.
public class quis1{ //deklarasi class
    public static void main(String[] args) { //deklarasi code utama (main code)
    Scanner sc = new Scanner (System.in); //deklarasi input baru di line code

    //variabel inputnya
    float tarif;
    float jarak;
    float biayabbm;
    float komisi;
    float resikolmb;
    float hargajualmkn;
    float biayamknn;
    float resikorskbrg;
    float jmltransaksi;

    // bagian code yang menampilkan bagian input untuk code.
     System.out.println("masukkan tarif dasar: ");
     tarif = sc.nextFloat();
     System.out.println("masukkan jarak perjalanan: ");
     jarak = sc.nextFloat();
     System.out.println("masukkan biaya bahan bakar: ");
     biayabbm = sc.nextFloat();
     System.out.println("masukkan komisi perusahaan (1%-20%): ");
     komisi = sc.nextFloat();
     System.out.println("masukkan resiko keterlambatan (1%-50%): ");
     resikolmb = sc.nextFloat();
     System.out.println("masukkan harga jual makanan: ");
     hargajualmkn = sc.nextFloat();
     System.out.println("masukkan biaya makanan: ");
     biayamknn = sc.nextFloat();
     System.out.println("masukkan resiko kerusakan barang (1%-50%): ");
     resikorskbrg = sc.nextFloat();
     System.out.println("Masukkan jumlah transaksi");
     jmltransaksi = sc.nextFloat();

    //bagian perhitungan dari code 
    float spd = (tarif * jarak)- (biayabbm * jarak);
    float jml_merchant = hargajualmkn - biayamknn;
    float komisi1 = komisi / 100 ;
    float jml_komisi = 1 - komisi1;
    float resikorskbrg1 = resikorskbrg / 100;
    float jml_resikorskbrg = 1-resikorskbrg1 ;
    float resikolmb1 = resikolmb / 100;
    float jml_resikolmb = 1- resikolmb1 ;
    float untungdrv1 = spd * jml_komisi;
    float untungdrv2 = untungdrv1 * jml_resikolmb;
    float untungmht1 = jml_merchant * jml_komisi;
    float untungmht2 = untungmht1 * jml_resikorskbrg;
    float untungdrv = untungdrv2 * jmltransaksi;
    float untungmht = untungmht2 * jmltransaksi;
    float totuntung = untungdrv + untungmht;
    float ratarata = totuntung / jmltransaksi;
    float drvpersen = (untungdrv / totuntung) * 100;
    float mhtpersen = (untungmht / totuntung) * 100;

    //bagian output dari code 
    System.out.println("keuntungan dari mitra driver = "+ (float) untungdrv);
    System.out.println("keuntungan dari mitra merchant = "+ (float) untungmht);
    System.out.println("total keuntungan dari kedua mitra = " + (float) totuntung);
    System.out.println("rata rata keuntungan " + (float) ratarata);
    System.out.println("presentase kontirbusi driver " + (float) drvpersen + "%");
    System.out.println("presentase kontribusi merchant" + (float) mhtpersen + "%");

     sc.close(); 
}
}