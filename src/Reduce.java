public class Reduce {
    public static void main(String[] args) {
        // get given number
        // if number is even, divide by 2, if odd, subtract by 1
        // print number of steps to get to 0
        int n = 100;
        int k = 0;

        while(n > 0){
            // if n is even, divide by 2
            if(n % 2 == 0){
                n = n / 2;
            }
            // n is odd, subtract 1
            else{
                n = n - 1;
            }
            k++;
        }
        System.out.println(k);
    }
}
