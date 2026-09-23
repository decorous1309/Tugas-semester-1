import java.util.Scanner;

public class gajikaryawan15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gajipokok;
        double bonus, totgaji;
        double tunjtransp =600000;
        double tunjmkn = 400000;

        System.out.print("Masukkan Gaji Pokok Anda : ");
        gajipokok=sc.nextInt();

        bonus = gajipokok * 0.1;
        totgaji = gajipokok + bonus + tunjtransp + tunjmkn- (0.1 * gajipokok);
        
        System.out.println("bonus bulanan anda Adalah = " + bonus);
        System.out.println (String.format("Gaji Yang Diterima Adalah = %f " , totgaji)); 
        sc.close();
    }
}