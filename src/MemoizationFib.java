import java.util.HashMap;
import java.util.Map;

public class MemoizationFib implements FibCalculator {

    //implements Fibonnaci calculator in a recursive way
    private static final Map<Long, Long> existingValue = new HashMap<>(); //save values in hashmap so no repitive calcualations

    @Override
    public long fib(final long n){

        if(n <= 1)
            return n;
        else if(existingValue.get(n) != null)
            return this.existingValue.get(n); //if this addition hasn't been performed yet, save the result

        final long result = fib(n-1) + fib(n-2);
        this.existingValue.put(n, result);

        return result;

    }
}
