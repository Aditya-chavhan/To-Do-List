package Projects;
import java.util.*;

public class ToDoList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        int choice;

        do {
            System.out.println("\nTO-DO LIST MENU");
            System.out.println("1. View Tasks");
            System.out.println("2. Add Task");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    // View Tasks
                    if (tasks.size() == 0) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("Your Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 2:
                    // Add Task
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task added!");
                    break;

                case 3:
                    // Delete Task
                    if (tasks.size() == 0) {
                        System.out.println("No tasks to delete.");
                    }
                    else {
                        System.out.println("Your Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }

                        System.out.print("Enter task number: ");
                        int num = sc.nextInt();
                        sc.nextLine();

                        if (num > 0 && num <= tasks.size()) {
                            String removed = tasks.remove(num - 1);
                            System.out.println("Deleted: " + removed);
                        }
                        else {
                            System.out.println("Invalid number!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Wrong choice!");
            }

        }
        while (choice != 4);
    }
}