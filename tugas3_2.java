import java.util.Scanner;
public class tugas3_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lembar;
        int biaya = 500;
        int jilid = 5000;
        int total;
        System.out.print("Masukkan jumlah lembar: ");
        lembar = sc.nextInt();
        total = (lembar * biaya) + jilid;
        System.out.println("Total biaya: " + total);
        sc.close();
}
}