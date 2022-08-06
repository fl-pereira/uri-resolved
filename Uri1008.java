import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number, time;
        double gain;

        number = sc.nextInt();
        time = sc.nextInt();
        gain = sc.nextDouble();

        double salary = time * gain;

        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", number,salary);


        sc.close();
    }

}
