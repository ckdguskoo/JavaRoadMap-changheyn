package Week1_2025_09_21_Start.ExceptionExam;

public class ExceptionExam {
    public static void main(String[] args) {
        int i = 10;
        int k = 0;

        try {
            System.out.println(i/k);
        }catch (Exception e){
            System.out.println(e.getMessage()); //간단한 에러메세지 출력
        }
    }



}
