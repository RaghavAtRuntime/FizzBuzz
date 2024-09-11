public class Multiples {
    public static void main(String[] args) {
        int n = 1000;
        int k = 0;
        for(int i = 0; i < n-1; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                k++;
            }
        }
        System.out.println(k);
    }
}
