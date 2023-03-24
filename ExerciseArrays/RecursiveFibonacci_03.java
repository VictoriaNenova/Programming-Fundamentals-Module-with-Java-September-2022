package MoreExerciseArrays;
import java.util.Scanner;
public class RecursiveFibonacci_03 {

private static long[] fibonacciCache;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        fibonacciCache = new long[n + 1]; //we create the size of the array to be n+1 , for example if you want to take the number on the 3-rd(last) index you
        // have to make the array with length of 4 -> [0 1 2 3]

        //In this solution we use Memoization, which is a optimization technique used primarily
        //to speed up programs by storing the results of function calls
        // and returning the cached result when the same inputs occur again
        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n) {
        if (n <= 1){ //base case(or "bottom"), we know our first and second numbers are 0 and 1,
            //so if n = 0 or n = 1 we return n
            return n;
        }
        if (fibonacciCache[n] != 0){
            //if we get a number different from 0 we know that we have already calculated the number
           return fibonacciCache[n];
        }
        long nthFibonacciNumber = fibonacci(n - 1) + fibonacci(n - 2);// we save the calculated number
        // to use it in the  next calculation. With this step we save a lot of time and the calculation is done almost immediately

        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }
}
