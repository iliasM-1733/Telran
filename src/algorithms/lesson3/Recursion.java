package algorithms.lesson3;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(recursionFactorial(5));
        System.out.println(iterationFactorial(5));
    }

    public static int recursion(int x) {
        return recursion(x++);
    }

    static int recursionFactorial(int x){
        if (x == 1){
            return 1;
        }
        return x * recursionFactorial(x - 1);
    }

    static int iterationFactorial(int x){
        int result=1;
        for (int i = 1; i <= x; i++)
        {
            result *= i;
        }
        return  result;
    }
}
