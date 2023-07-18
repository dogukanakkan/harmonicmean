import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç sayı gireceksiniz ?:  ");
        int sayiAdedi = scanner.nextInt();

        double[] sayilar = new double[sayiAdedi];
        double toplamTers = 0;

        for (int i = 0; i < sayiAdedi; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz : ");
            sayilar[i] = scanner.nextDouble();
            toplamTers += 1 / sayilar[i];
        }

        double harmonikOrtalama = sayiAdedi / toplamTers;

        System.out.println("Harmonik Ortalama: " + harmonikOrtalama);

        scanner.close();

    }
}