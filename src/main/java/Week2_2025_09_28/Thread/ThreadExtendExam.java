package Week2_2025_09_28.Thread;

public class ThreadExtendExam extends Thread {
    String str;
    public ThreadExtendExam(String str) {
        this.str = str;
    }


    @Override
    public void run() { //원하는 작업을 실행
        for (int i = 0; i < 10; i++) {
            System.out.println(str+" : "+i);
            try {
                Thread.sleep(1000); //실행속도가 빠르므로 속도조절을위해 사용
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
