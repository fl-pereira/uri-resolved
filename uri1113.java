import java.util.Scanner;

public class uri1113 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x,y;

        x = sc.nextInt();
        y = sc.nextInt();

        do {
            if (x < y) {
                System.out.println("Crescente");
                x = sc.nextInt();
                y = sc.nextInt();
            } else {
                System.out.println("Decrescente");
                x = sc.nextInt();
                y = sc.nextInt();
            }
        } while(x != y);

        sc.close();


    }

}
