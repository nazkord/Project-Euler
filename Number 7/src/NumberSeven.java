/**
 * Number 7
 * Created by nazar on 26.05.2018.
 */
public class NumberSeven {
    private static int n = 10000000;
    private static int m = 10005;
    private static int[] allNumbers = new int[n];


    public static void main(String[] args) {
        for(int i=2;i<n;i++) {
            allNumbers[i]=i;
        }

        changes();
        for(int i=0;i<10003;i++)
        System.out.println(primeNumbers[i] + " ");
    }


    public static void elimination(int q) {
        int x=q;
        q+=x;
        while(q<n) {
            allNumbers[q]=0;
            q+=x;
        }
    }

    private static int[] primeNumbers = new int[m];

    public static void changes() {
        int i=2;
        int j=2;
        while(i<m) {
            if(allNumbers[j]!=0) {
                primeNumbers[i]=allNumbers[j];
                i++;
            }
            j++;
        }
    }
    //Answeer is: 104743 !!!.

}
