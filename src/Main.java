import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        engine();
    }

    public static void mainMenu() {
        System.out.println("""
        ==== TO DO LIST ====
        1 - Add task
        2 - List tasks
        3 - Remove task
        4 - Exit
        ====================
        """);
    }
    public static void engine() {
        while (true) {
            mainMenu();

            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Add task:");
                    String task = sc.nextLine();

                    tasks.add(task);
                }
                case 2 -> {
                    if (tasks.isEmpty()) {
                        System.out.println("""
                    No tasks yet!
                    ====================
                    Press Enter to return. . .
                    """);
                        sc.nextLine();
                    } else {
                        System.out.print("""
                            Tasks List:
                            ====================
                            """);
                        System.out.println(tasks);

                        System.out.println("""
                    ====================
                    Press Enter to return. . .
                    """);
                        sc.nextLine();
                    }
                }
                case 3 -> {
                    if (tasks.isEmpty()) {
                        System.out.println("""
                    No tasks yet!
                    ====================
                    Press Enter to return. . .
                    """);
                        sc.nextLine();
                    } else {
                        System.out.println("""
                            Remove task:
                            ====================
                            """ + tasks);

                        System.out.println("""
                    ====================
                    Press Enter to return. . .
                    """);
                        sc.nextLine();

                        String task = sc.nextLine();

                        tasks.remove(task);
                    }
                }
                case 4 -> {
                    System.out.println("Exit");
                    return;
                }
                default -> System.out.println("Invalid number!");
            }
        }
    }
}