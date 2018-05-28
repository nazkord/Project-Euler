/**
 * Number 4
 * Created by nazar on 24.05.2018.
 */
public class NumberFour {
    public static void main(String[] args) {
    for(int n=700;n<1000;n++)
        for(int i=n;i<1000;i++) {
            if(palindrom(i*n))
                System.out.println(i*n);
        }
    }

    public static boolean palindrom(int x) {
        String numberStr = Integer.toString(x);
        String reverseStr = new StringBuilder(numberStr).reverse().toString();
        if(reverseStr.equals(numberStr))
            return true;
        else
            return false;

    }
}
