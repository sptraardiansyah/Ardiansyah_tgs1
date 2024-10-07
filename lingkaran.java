import java.util.Scanner;
public class lingkaran {
    public static void main(String[] args) {
        Scanner Inputan = new Scanner(System.in);
        Double R,k;
        System.out.println("masukan R=");
        R =Inputan.nextDouble();
        k =2 * 3.14*R;
        System.out.println("Keliling lingkaran adalah:"+k);
    }
}
