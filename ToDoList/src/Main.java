import java.util.*;

public class Main {
    public static void main(String[] args) {
// create tasks; mark them has done; unmark them; edit them; eliminate them; organize them A-Z;

        int tasksMaximum = 150;
        String[] tasks = new String[tasksMaximum];
        boolean[] complete = new boolean[tasksMaximum];
        int counterTasks = 0;
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("\033[0;33m" + "\nTo-Do List:" + "\033[0m");
            System.out.println("==================================");

            /*for (int i = 0; i < counterTasks - 1; i++) {
                for (int j = i + 1; j < counterTasks; j++) {
                    if (tasks[i].charAt(0) > tasks[j].charAt(0)) {
                        String tempTask = tasks[i];
                        tasks[i] = tasks[j];
                        tasks[j] = tempTask;
                    }
                }
            }*/
            Arrays.sort(tasks,0,counterTasks);

            for (int i = 0; i < counterTasks; i++) {

                System.out.println((i + 1) + ". " + (complete[i] ? "[X] " : "[ ] ") + tasks[i]);

            }

            System.out.println("\n\n\n\n==================================");
            System.out.println("\033[33m" + "\n Your options : " + "\033[0m");
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. Edit task");
            System.out.println("4. Mark as completed");
            System.out.println("5. Unmark as completed");
            System.out.println("6. Exit List");
            System.out.println("Choose option : ");
            String options = input.next();
            input.nextLine();
            switch (options) {
                case "1":
                    if (counterTasks < tasksMaximum) {
                        System.out.println("Write task: ");
                        String writeTask = input.nextLine();
                        tasks[counterTasks] = writeTask;
                        complete[counterTasks] = false;
                        counterTasks++;
                    } else {
                        System.out.println("List full");
                    }
                    break;
                case "2":
                    if (counterTasks == 0) {
                        System.out.println("No tasks to remove!");
                    } else {
                        System.out.println("Enter which task number to remove: ");
                        int numberTask = input.nextInt();
                        input.nextLine();
                        if (numberTask > 0 && numberTask <= counterTasks) {
                            for (int i = numberTask - 1; i < counterTasks - 1; i++) {
                                tasks[i] = tasks[i + 1];
                                complete[i] = complete[i + 1];
                            }
                            counterTasks--;
                            tasks[counterTasks] = null;
                            complete[counterTasks] = false;
                            System.out.println("Removed the task input");
                        } else {
                            System.out.println("Invalid task number");
                        }
                    }
                    break;
                case "3":
                    if (counterTasks == 0) {
                        System.out.println("No tasks to edit!");
                    } else {
                        System.out.println("Enter which task number to edit: ");
                        int numberTask = input.nextInt();
                        input.nextLine();
                        if (numberTask > 0 && numberTask <= counterTasks) {
                            System.out.println("Enter change in task");
                            String newChange = input.nextLine();
                            tasks[numberTask - 1] = newChange;
                        } else {
                            System.out.println("Invalid task number");
                        }
                    }
                    break;
                case "4":
                    if (counterTasks == 0) {
                        System.out.println("No tasks marked as complete");
                    } else {
                        System.out.println("Enter which task number to complete: ");
                        int numberTask = input.nextInt();
                        input.nextLine();
                        if (numberTask > 0 && numberTask <= counterTasks) {
                            complete[numberTask - 1] = true;
                            System.out.println("Task completed");
                        } else {
                            System.out.println("Invalid task number");
                        }
                    }
                    break;
                case "5":
                    if (counterTasks == 0) {
                        System.out.println("No tasks to unmark");
                    } else {
                        System.out.println("Enter which task number to unmark: ");
                        int numberTask = input.nextInt();
                        input.nextLine();
                        if (numberTask > 0 && numberTask <= counterTasks) {
                            complete[numberTask - 1] = false;
                            System.out.println("Task completion unmarked");
                        } else {
                            System.out.println("Invalid task number");
                        }
                    }
                    break;
                case "6":
                    System.out.println("Exiting list");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, please input correct one");
                    break;
            }


        }
    }
}



