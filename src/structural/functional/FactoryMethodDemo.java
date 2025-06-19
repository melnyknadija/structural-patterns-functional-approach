package structural.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class FactoryMethodDemo {
    public static void run() {
        Supplier<List<String>> factory = ArrayList::new;
        List<String> list = factory.get();
        list.add("Hello");
        System.out.println(list);
    }
}
