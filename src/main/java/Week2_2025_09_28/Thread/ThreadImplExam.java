package Week2_2025_09_28.Thread;

public class ThreadImplExam implements Runnable { //runnable은 기능 정의만
    String str;
    public ThreadImplExam(String str) {
        this.str = str;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(str+":"+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
