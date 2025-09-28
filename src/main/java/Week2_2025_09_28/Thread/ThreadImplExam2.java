package Week2_2025_09_28.Thread;

public class ThreadImplExam2 {
    public static void main(String[] args) {
        ThreadImplExam t1 = new ThreadImplExam("*");
        ThreadImplExam t2 = new ThreadImplExam("-");
        Thread thread = new Thread(t1);   //실행을 시키기위해서는 thread객체 생성
        Thread thread1 = new Thread(t2);

        System.out.println("main thread start");


        thread.start();
        thread1.start();

        System.out.println("main thread end");
    }
}
