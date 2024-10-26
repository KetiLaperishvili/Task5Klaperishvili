public class Task4 {

    public void greet() {
        System.out.println("Hallo!");
    }
    public void greet(String name) {
        System.out.println("Hallo, " + name + "!");
    }

    public static void main(String[] args) {
        Task4 greeter = new Task4();
        greeter.greet();
        greeter.greet("Alice");
    }
}

