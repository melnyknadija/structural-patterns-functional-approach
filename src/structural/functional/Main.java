package structural.functional;

public class Main {
    public static void main(String[] args) {
        System.out.println("Functional Strategy:");
        StrategyDemo.run();

        System.out.println("\nFunctional Factory Method:");
        FactoryMethodDemo.run();

        System.out.println("\nFunctional Decorator:");
        DecoratorFuncDemo.run();

        System.out.println("\nExecute Around:");
        ExecuteAround.run();
    }
}
