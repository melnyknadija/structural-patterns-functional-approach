package structural.functional;

import java.util.function.Function;

public class DecoratorFuncDemo {
    public static void run() {
        Function<String, String> base = String::trim;
        Function<String, String> decorated = base.andThen(s -> "[" + s + "]");
        System.out.println(decorated.apply("  Decorated Text  "));
    }
}
