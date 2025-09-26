package Week1_2025_09_21_Start.ArrayList;

import java.util.ArrayList;

public class ArrayListExam {
    ArrayList<Integer> arrayList;
    public ArrayListExam() {
        arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

    }

    public static void main(String[] args) {
        ArrayListExam obj = new ArrayListExam();
        System.out.println(obj.arrayList.remove(0));
        System.out.println(obj.arrayList);
        System.out.println(obj.arrayList.size());

    }
}
