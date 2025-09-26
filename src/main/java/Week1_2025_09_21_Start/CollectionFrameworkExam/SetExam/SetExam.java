package Week1_2025_09_21_Start.CollectionFrameworkExam.SetExam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        boolean flag1 = set1.add("a"); //데이터 저장
        boolean flag2  =set1.add("b");
        boolean flag3  =set1.add("a");

        System.out.println(set1.size());

        System.out.println(flag1); //불린값을 리턴함. 값이 중복없이 저장되면 true 중복값이 있으면 false를 리턴하고 저장안함
        System.out.println(flag2);
        System.out.println(flag3);  

        Iterator<String> iterator1 = set1.iterator(); //Iterator로 하나씩 값에 접근

        while (iterator1.hasNext()){ //값의 존재여부 확인후 불린값 리턴
            String str =iterator1.next(); // 저장된값 한개 출력
            System.out.println(str);
        }

    }
}
