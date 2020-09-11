//zad. 77

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayAdd {
    public static final String EXIT = "exit";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println("\"EXIT\" kończy dodwanie liczb");
        adding(list);
        printList(list);
        sc.close();
    }

    private static void printList(List<Integer> list) {
        if (!list.isEmpty()) {
            StringBuilder builder = new StringBuilder();
            int sum = 0;
            for (int i : list) {
                builder.append(i);
                builder.append(" + ");
                sum += i;
            }
            builder.replace(builder.length() - 1, builder.length(), " = ");
            builder.append(sum);
            System.out.println(builder.toString());
        }
    }

    private static void adding(List<Integer> list) {
        System.out.print("Podaj liczbę: ");
        String input = sc.nextLine();
        if (input.equals(EXIT))
            return;

        try {
            Integer number = Integer.valueOf(input);
            list.add(number);
        } catch (NumberFormatException e) {
            System.out.println("Wprowadzono nieodpowiednią liczbę. Spróbuj ponownie.");
        }
        adding(list);
    }
}
