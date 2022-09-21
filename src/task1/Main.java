package task1;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new Random().ints(1, 101).limit(20).boxed().toList();
        System.out.println("\nAll numbers: ");
        arrayList.forEach(System.out::println);
        System.out.println("\nAll even numbers: ");
        arrayList.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
        System.out.println("\nCount: ");
        System.out.println(arrayList.stream().filter(x -> x % 2 == 0).count());

    }
}