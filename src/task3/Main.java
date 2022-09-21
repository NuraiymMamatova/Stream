package task3;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> AL = List.of("abcd", "bcfk", "def", "jklmn", "jprst",
                "afc", "ambn", "kmk", "qrbd", "jus");
        System.out.println("\nNatural order: ");
        AL.forEach(System.out::println);
        System.out.println("\nAscending order: ");
        AL.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        System.out.println("\nDescending order: ");
        AL.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
