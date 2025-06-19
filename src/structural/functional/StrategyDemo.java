package structural.functional;

import java.util.function.Function;

public class StrategyDemo {
    public static void run() {
        Function<Integer, String> evenOddStrategy = (x) -> x % 2 == 0 ? "Even" : "Odd";
        System.out.println("5 is " + evenOddStrategy.apply(5));
        System.out.println("6 is " + evenOddStrategy.apply(6));
    }
}
