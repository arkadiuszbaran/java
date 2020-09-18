//zad. 82
//ćw. 1

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
    public static final int ADD_TASK = 1;
    public static final int SHOW_TASK = 2;
    public static final int EXIT = 3;

    static Scanner sc = new Scanner(System.in);
    static Queue<Task> queue = new PriorityQueue<>();

    public static void main(String[] args) {
        int option;
        do {
            printOptions();
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case ADD_TASK:
                    queue.offer(addTask());
                    System.out.println("Dodano nowe zadanie");
                    break;
                case SHOW_TASK:
                    showTask();
                    break;
                case EXIT:
                    exitProgram();
                    break;
                default:
                    System.out.println("Wybrano złą opcję");
            }
        } while (option != EXIT);
    }

    private static void exitProgram() {
        System.out.println("Zakończono działanie programu");
        sc.close();
    }

    private static void showTask() {
        if (queue.isEmpty())
            System.out.println("Brak zadań");
        else {
            System.out.print("Zadanie do wykonania: ");
            System.out.print(queue.poll());
        }
    }

    private static Task addTask() {
        String name, description;
        Task.Priority priority;

        System.out.print("Podaj nazwę zadania: ");
        name = sc.nextLine();
        System.out.print("Podaj opis: ");
        description = sc.nextLine();
        System.out.print("Nadaj priorytet: ");
        for (Task.Priority value : Task.Priority.values())
            System.out.print(value + " ");
        System.out.println();
        priority = Task.Priority.valueOf(sc.nextLine());
        return new Task(name, description, priority);
    }

    private static void printOptions() {
        System.out.println("Wybierz opcję:");
        System.out.println("1. Dodaj nowe zadanie");
        System.out.println("2. Pobierz zadanie o najwyższym priorytecie");
        System.out.println("3. Wyjście z aplikacji");
    }
}


