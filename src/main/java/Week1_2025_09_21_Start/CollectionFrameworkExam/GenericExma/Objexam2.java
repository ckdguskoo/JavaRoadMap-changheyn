package Week1_2025_09_21_Start.CollectionFrameworkExam.GenericExma;

public class Objexam2 {
    public static void main(String[] args) {
        ObjExam objExam = new ObjExam();

        objExam.setObj(objExam);
        Object obj = objExam.getObj();

        objExam.setObj("hello");
        String str = (String)objExam.getObj(); //명시적 형변환
        System.out.println(str);

        objExam.setObj(1);
        int i = (int)objExam.getObj();
        System.out.println(i);
    }
}
