public class RecursiveFib implements FibCalculator{
    @Override
    public long fib(final long n){
        if(n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
