public class Main {


    public static void main(String[] args){
    //a recursive solution would take O(2^n) time. This solution will take O(n) time
        FibCalculator recursiveCalculator = new RecursiveFib(); //O(2^n) time
        FibCalculator fibCalculator = new IterativeFib(); //O(n) time
        FibCalculator memoizeCalculator = new MemoizationFib(); //Also O(n)

        System.out.println(memoizeCalculator.fib(70));
    }
}
