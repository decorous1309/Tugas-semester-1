import java.util.Scanner;
public class diskontokobuku15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("apakah hari ini hari rabu ? (true /false): ");
        boolean hari = sc.nextBoolean();
        System.out.println("apakah membeli buku novel ?");
        boolean novel = sc.nextBoolean();
        System.out.println("apakah membeli buku kamus ");
        boolean kamus = sc.nextBoolean();
        System.out.println(" apakah membeli selain buku kamus dan novel");
        boolean selain = sc.nextBoolean();
        System.out.println(" berapa beli buku novel (jika tidak membeli beri angka 0)");
        int jmlnovel = sc.nextInt();
        System.out.println(" berapa beli buku kamus (jika tidak membeli beri angka 0)");
        int jmlkamus = sc.nextInt();
        System.out.println(" berapa beli buku selainnya (jika tidak membeli beri angka 0)");
        int jmlselain = sc.nextInt();

        System.out.println(" kalau beli kamus elu bisa dapat diskon");
        if ( hari ){
            if ( kamus ){
                if (jmlkamus < 2 && jmlkamus > 0){
                        System.out.println("diskon 10% bang");
                } else if (jmlkamus > 2){
                    System.out.println(" diskon dapat 10% plus 2%");
                }else {
                    System.out.println( " enggak beli kamus ya ");
                }
            } else {
                System.out.println( " beli novel aja berarti ");
            }
        }else {
            System.out.println("bukan hari rabu, enggak ada diskon bro !" );
        }
        System.out.println("kalau beli novel dapat diskon cuy");
        if ( hari ){
            if ( novel ){
                if (jmlnovel < 3 && jmlnovel > 0){
                        System.out.println("diskon 7% bang");
                        System.out.println("dan kayak ya dapet diskon 1% ");
                } else if (jmlnovel > 3){
                    System.out.println(" diskon dapat 7% plus 2%");
                }else {
                    System.out.println( " enggak beli novel ya ");
                }
            } else {
                System.out.println( " beli kamus aja berarti ");
            }
        }else {
            System.out.println("dah di bilangin enggak ada diskon !" );
        }
        System.out.println(" kalau beli buku lain tetep dapet diskon kok");
        if ( hari ){
            if ( selain ){
                if (jmlselain > 3 ){
                    System.out.println(" diskon dapat 5% doang mas");
                    }else if  (jmlselain < 3 &&  jmlselain > 0){
                    System.out.println("beli banyak lagi, biar dapat diskon");
                 }else {
                    System.out.println( " ngapain bilang iya, kamu enggak beli buku lain gitu ");
                }
            } else {
                System.out.println( " udah beli buku kan elu ");
            }
        }else {
            System.out.println("besok besok aja beli buku !" );
        }
        
        if (jmlkamus == 0 && jmlnovel == 0 && jmlselain == 0){
            System.out.println( " katanya beli, kok enggak beli apa apa cuy! ");
        } else if ( novel && kamus && selain) {
            System.out.println( " anjay borong kah ");
        } else if (!novel && !kamus && !selain ){
            System.out.println("lihat lihat aja kah");
        }
        sc.close();
    }
}
