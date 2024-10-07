import java.util.Scanner;
public class suhu {
    public static void main(String[] args) {
        Scanner Inputan = new Scanner(System.in);
        double C,F;
        System.out.println("masukan C=");
        C =Inputan.nextDouble();
        F = C*9.0/5.0+32.0;
        System.out.println("fahrenheit adalah:"+F);
    }
}
