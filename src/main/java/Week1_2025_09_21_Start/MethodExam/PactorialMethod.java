package Week1_2025_09_21_Start.MethodExam;

import java.util.ArrayList;
import java.util.List;

public class PactorialMethod {

    int a = 1;

    public int Pactorial(int input){
        for (int i = 1; i <= input; i++) {
            a = a * i;
        }
        return a;
    }

    public void pivonach(int input){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        int p = 1;
        for (Integer i = 1; i <= input; i++) {
            list.add(list.get(p) + list.get(p-1));
            p++;
        }

        System.out.println(list);

    }


}
