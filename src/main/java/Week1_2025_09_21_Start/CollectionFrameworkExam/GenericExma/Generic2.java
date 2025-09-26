package Week1_2025_09_21_Start.CollectionFrameworkExam.GenericExma;

public class Generic2 {
    public static void main(String[] args) {
        Generic<ObjExam> box  = new Generic<>(); //<> 안에 원하는 타입을 입력하여 사용가능
        box.setObj(new ObjExam());
        Object obj = box.getObj();

        Generic<String> str = new Generic<>(); 
        str.setObj("hello");
        str.getObj(); 

        Generic<Integer> i = new Generic<>();
        i.setObj(4);
        int v2 = i.getObj(); //오토 언박싱
    }
}
