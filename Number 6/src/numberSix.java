/**
 * Number 6
 * Created by nazar on 24.05.2018.
 */
public class numberSix {
    public static void main(String[] args) {
        long sum1 = 0;
        long sum2 = 0;
        for(int i=1;i<=100;i++) {
            sum1+= i*i;
        }
        for(int i=1;i<=100;i++)
            sum2+=i;
        System.out.println(Math.abs(sum2*sum2-sum1));
    }
}

