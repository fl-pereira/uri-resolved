import java.util.Locale;
import java.util.Scanner;

public class Uri1019 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int hour = 3600;
        int minute = 60;

        int h   = N / hour;
        int hR  = N % hour;
        int m   = hR / minute;
        int s   = N % minute;

        System.out.println(h + ":" + m + ":" + s);

        sc.close();
    }

}
