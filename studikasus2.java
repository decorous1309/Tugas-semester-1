import java.util.Scanner;
public class studikasus2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int panjang = 100;
        int lebar = 30;
        float R = 2.5f;
        int sisi = 2;
        float phi = 3.14f;
        System.out.println( "Masukkan panjang tanah: ");
        panjang = sc.nextInt();
        System.out.println( "Masukkan lebar tanah: ");
        lebar = sc.nextInt();
        System.out.println( "Masukkan jari jari kolam: ");
        R = sc.nextFloat();
        System.out.println( "Masukkan sisi taman: ");
        sisi = sc.nextInt();
        System.out.println( "Masukkan phi: ");
        phi = sc.nextFloat();
        int ltanah = panjang * lebar;
        float kolam = R * R * phi;
        int taman = sisi * sisi;
        float sisa = ltanah - (kolam + taman);
        System.out.println( "sisa lahan tanah adalah :"+ sisa);
        sc.close();
    }

}