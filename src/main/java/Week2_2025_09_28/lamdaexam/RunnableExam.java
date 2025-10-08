package Week2_2025_09_28.lamdaexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class RunnableExam {
    public static void main(String[] args) {
        Function<Integer, Integer> fun = x -> x+10;
        System.out.println(fun.apply(5));


        Runnable r = () -> System.out.println("Hello Lamda");
        r.run();

        List<String> names = Arrays.asList("a", "b", "c");
        names.forEach(System.out::println);
        names.forEach(name -> System.out.println(name));

    }


}
