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

    public int fibonnacci(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fibonnacci(n - 1) + fibonnacci(n - 2);
    }

    public int computation(int n) {
		int fibonnacci = fibonnacci(n);
		int factorial = factorial(n);
        return factorial + fibonnacci;
    }
   
}
