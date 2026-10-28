import java.util.Scanner;
public class Tugas2Loop15 {
    public static void main(String[] args) {
        Scanner fr = new Scanner (System.in);
        System.out.print("Masukkan nilai n: ");
        int n = fr.nextInt();
        int total = 0;
        int a = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    a = i*j;
                    System.out.print(i*j+"\t");
                    total += a;
                }
            System.out.println();
            }
            System.out.println("Total =" + total);
        fr.close();
    }
}