package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String name = "value";
        while (!(name.equals(""))) {
            System.out.println("If you want stop this operation then enter return");
            list.add(name = scanner.nextLine());
        }
        System.out.println("\nAll names");
        list.forEach(System.out::println);
        System.out.println("\nAll names starts with  'A' ");
        list.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);
        System.out.println("\nCount: " + list.stream().filter(s -> s.startsWith("A")).count());
    }
}
