public class Main {
    public static void main(String[] args) {
        Integer[] a1 = {44, 56, 21, 43, 89, 54, 73, 11, 22, 90};
        int empty = 0;
        int i,index;
        for (i =0; i < a1.length-1; i++) {
            index=i;
            for (int j = i+1; j < a1.length; j++) {
                if (a1[index] > a1[j]) {
                    index = j;
                }
            }
                empty = a1[i];
                a1[i] = a1[index];
                a1[index] = empty;

        }
        for(int k:a1){
            System.out.print(k+" ");
        }
        System.out.print("\n"+a1[a1.length-2]);
    }

}