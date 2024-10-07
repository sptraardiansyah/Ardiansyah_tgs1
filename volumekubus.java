import java.util.Scanner;
public class volumekubus {
    public static void main(String[] args) {
        Scanner Inputan = new Scanner(System.in);
        int S,V;
        System.out.println("masukan S=");
        S =Inputan.nextInt();
        V = S*S*S;
        System.out.println("volume kubus adalah:"+V);
    }
}

