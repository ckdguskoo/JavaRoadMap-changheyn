package Week2_2025_09_28.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExam {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("a", "b", "asdfc","a","b","c");

        names.stream().forEach(System.out::println);
        names.stream().forEach(System.out::println);

        System.out.println("=".repeat(50));

        names.stream()
                .filter(n->n.equals("a"))
                .forEach(System.out::println);

        System.out.println("=".repeat(50));

        List<Integer> lengths = names.stream()
                .map(n -> n.length())
                .collect(Collectors.toList());
        System.out.println(lengths);


        System.out.println("=".repeat(50));

//        int sum  = Arrays.asList(1,2,3,4,5)
//                .stream()
//                .reduce(0,(a,b)->a+b);
//
//        System.out.println("=".repeat(50));
//        Scanner scanner = new Scanner(System.in);
//
//        Predicate<Integer> isEmpty = s -> s == 10;
//        System.out.println(isEmpty.test(scanner.nextInt())); // true 출력
//
//        System.out.println("=".repeat(50));
//
//        int s = scanner.nextInt();
//        boolean b = s ==10;
//        System.out.println(b);


        List<String> list = Arrays.asList("A", "B", "C");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
        // stream.forEach(System.out::println); // 스트림은 한번사용하면 못씀




    }
}
