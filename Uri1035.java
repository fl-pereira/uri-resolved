import java.util.Locale;
import java.util.Scanner;

// Deu certo, mas o Uri não aceita
public class Uri1035 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int sumcd   = C + D;
        int sumab   = A + B;
        int ar      = A % 2;

        if(B > C && D > A){
            if (sumcd > sumab){
                if(C > 0 && D > 0 && ar == 0){
                    System.out.println("Valores aceitos");
                }
            }
        } else {
            System.out.println("Valores nao aceitos");
        }


        sc.close();
    }

}
