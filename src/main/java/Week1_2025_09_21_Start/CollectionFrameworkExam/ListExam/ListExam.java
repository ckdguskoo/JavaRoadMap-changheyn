package Week1_2025_09_21_Start.CollectionFrameworkExam.ListExam;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("1");

        System.out.println(list.size()); //중복허용

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }


    }
}
