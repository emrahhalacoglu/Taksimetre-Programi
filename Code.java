import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        double taksimetreTurari,baslangicTutari,mesafe,kilometreTutari,minimumOdeme;
        baslangicTutari=10;
        kilometreTutari=2.20;
        minimumOdeme=20;
        Scanner input=new Scanner(System.in);
        System.out.print("Mesafe Giriniz :");
        mesafe=input.nextDouble();
        taksimetreTurari=baslangicTutari+mesafe*kilometreTutari;
        boolean k1=(taksimetreTurari<=20);
        taksimetreTurari=k1?minimumOdeme:taksimetreTurari;
        System.out.println("Taksimetre Tutari :"+taksimetreTurari+" TL");
    }
    
}
