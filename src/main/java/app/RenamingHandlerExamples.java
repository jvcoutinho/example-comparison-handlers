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

    public int computation(int n) {
		int fibonnacci = 0;
		int factorial = factorial(n);
        return factorial + fibonnacci;
    }
   
}
