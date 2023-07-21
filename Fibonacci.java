import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
//    Integer a[] = {0,1};
        ArrayList<Integer>a = new ArrayList<Integer>();
        a.add(0);
        a.add(1);
        int n = 6;
        int sum = 0;
        for (int i = 0 ; i <= n-3 ; i++){
            {
               a.add(a.get(i)+a.get(i+1));
            }
        }
        for(int i:a){
            System.out.println(i);
        }
    }
}
