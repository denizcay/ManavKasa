import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Armut: 2,14 TL");
        System.out.println("Elma: 3,67 TL");
        System.out.println("Domates: 1,11 TL");
        System.out.println("Muz: 0,95 TL");
        System.out.println("Patlıcan: 5 TL");
        System.out.print("Armut kaç kg?");
        double armut = imput.nextDouble();
        System.out.print("Elma kaç kg?");
        double elma = imput.nextDouble();
        System.out.print("Domates kaç kg?");
        double domates = imput.nextDouble();
        System.out.print("Muz kaç kg?");
        double muz = imput.nextDouble();
        System.out.print("Patlıcan kaç kg?");
        double patlican = imput.nextDouble();
        double sonuc = armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5.0;
        System.out.println("Toplam tutar = " + sonuc +" TL");
    }
}
