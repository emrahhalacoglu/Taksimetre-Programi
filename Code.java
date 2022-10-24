import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        double taksimetreTurari,baslangicTutari,mesafe,kilometreTutari,minimumOdeme;
        baslangicTutari=10;
        kilometreTutari=2.20;
        minimumOdeme=20;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Mesafe Giriniz :");
            mesafe=input.nextDouble();
        }
        taksimetreTurari=baslangicTutari+mesafe*kilometreTutari;
        taksimetreTurari=(taksimetreTurari<20)?minimumOdeme:taksimetreTurari;
        System.out.println("Taksimetre Tutari :"+taksimetreTurari+" TL");
    }
    
}
