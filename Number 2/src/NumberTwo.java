/**
 * Number 2
 * Created by nazar on 24.05.2018.
 */
import java.lang.reflect.Array;
import java.util.Scanner;

public class NumberTwo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int i = 2;
        int sum = 0;
        long[] fibArray = new long[100000];
        fibArray[0]=1;
        fibArray[1]=1;
        fibArray[2]=2;

        while(fibArray[i]<4000000) {
            fibArray[i+1]=fibArray[i-1]+fibArray[i];
            if(fibArray[i]%2==0)
                sum+=fibArray[i];
            i++;
        }

        System.out.println(fibArray[n] + " " + sum);
    }


}

