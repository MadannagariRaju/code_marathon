public class ParameterisedAndFunctionalRecursion {

    public static void sumOfNaturalNumbers(int n, int sum) {
        // System.out.println("n : " +n + "sum : " + sum);
        if(n == 0) {
            System.out.println(sum);
            return;
        }
        // System.out.println(sumOfNaturalNumbers(n-1, sum+1));
        sumOfNaturalNumbers(n-1, sum+n);
    }

    public static int sumOfNaturalNumbersFunctionalRecursion(int n) {
        if(n == 0) {
            return 0;
        }
        return n + sumOfNaturalNumbersFunctionalRecursion(n-1);
    }

    public static void factorialParameterised(int n, int m) {
        if(n == 1) {
            System.out.println(m);
            return;
        }
        factorialParameterised(n-1,m*(n-1));
    }

    public static int factorialFunctional(int n) {
        if(n == 1) return 1;
        return n * factorialFunctional(n-1);
    }
    public static void main(String[] args) {
        
        // sum of N natural numbers using Parameterised Recursion
        int n = 3;
        int sum = 0;
        // sumOfNaturalNumbers(n, sum);

        // sum of N natural numbers using Functional Recursion
        // sum = sumOfNaturalNumbersFunctionalRecursion(n);
        // System.out.println(sum);

        // factorialParameterised(n, n);

        int result = factorialFunctional(n);
        System.out.println(result);


    }
}
