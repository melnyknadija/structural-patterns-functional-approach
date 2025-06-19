package structural.functional;

public class ExecuteAround {
    public static void runWith(Runnable before, Runnable after, Runnable action) {
        before.run();
        try {
            action.run();
        } finally {
            after.run();
        }
    }

    public static void run() {
        runWith(
                () -> System.out.println("Open resource"),
                () -> System.out.println("Close resource"),
                () -> System.out.println("Performing action")
        );
    }
}
