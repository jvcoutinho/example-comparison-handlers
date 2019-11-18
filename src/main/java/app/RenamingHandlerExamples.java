package app;

/**
 * Hello world!
 */
public final class RenamingHandlerExamples {

    public int factorial(int n) {
        if(n == 0)
            return 1;
        return factorial(n - 1) * n;
    }

    public int fibonnacci2(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fibonnacci2(n - 1) + fibonnacci2(n - 2);
    }

    public int computation(int n) {
		int fibonnacci = 0;
		int factorial = factorial(n);
        return factorial + fibonnacci2(n);
    }
   
}