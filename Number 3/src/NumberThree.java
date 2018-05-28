import java.util.Scanner;

/**
 * Number 3
 * Created by nazar on 24.05.2018.
 */
public class NumberThree {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double n = reader.nextDouble();
        double maxx = 0;
        for(double i=2;i<=n/2;i++) {
            if(n%i==0 && PrimeFactor(i))
                maxx = i;
        }

        System.out.println(maxx);

    }

    public static boolean PrimeFactor(double x) {
        if(x%2==0 || x%3==0 || x%5==0 || x%7==0)
            return false;
        else {
            double maxx = 0;
            for (double i = 2; i < x / 2; i++) {
                if (x % i == 0)
                    maxx = i;
            }
            if (maxx == 0)
                return true;
            else
                return false;
        }

    }
}
