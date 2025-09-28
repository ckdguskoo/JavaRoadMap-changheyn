package Week2_2025_09_28.Thread;

public class ThreadExtendExam2 {
    public static void main(String[] args) {
        ThreadExtendExam t1 = new ThreadExtendExam("*");
        ThreadExtendExam t2 = new ThreadExtendExam("-");

        t1.start();
        t2.start();

        System.out.println("main thread end");
    }
}
