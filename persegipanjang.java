import java.util.Scanner;
public class persegipanjang {
    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        int P,L,Luas;
        System.out.println("masukan P=");
        P= inputan.nextInt();
        System.out.println("masukan L=");
        L= inputan.nextInt();
        Luas= P*L;
        System.out.println("luas persegi panjang adalah = "+Luas);

    }
}
