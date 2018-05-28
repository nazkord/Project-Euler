/**
 * Number 1_2
 * Created by nazar on 24.05.2018.
 */
public class Main {

        public static void main(String args[]) {
            int n = 1000;
            int w = 3;
            int q = 5;
            while (w < n) {
                if(w%5!=0)
                    MultiplesOf3.sumOf3 +=w;
                w+=3;
            }
            while (q < n) {
                MultiplesOf5.sumOf5 +=q;
                q+=5;
            }
            int mainSum = MultiplesOf3.sumOf3 + MultiplesOf5.sumOf5;
            System.out.println("The sum is " + mainSum);
        }

}
