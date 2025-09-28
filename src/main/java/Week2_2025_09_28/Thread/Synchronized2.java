package Week2_2025_09_28.Thread;

public class Synchronized2 {
    public static void main(String[] args) throws InterruptedException {
        SynchronizedExam s1 = new SynchronizedExam();

        //10개의쓰레드가 각각 count를 1000번씩 증가
        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) { //10개의 쓰레드
            threads[i] = new Thread(() ->{
                for (int j = 0; j < 1000; j++) { //1000증가
                    s1.plus();
                }
            });
            threads[i].start(); //쓰레드 실행
        }

        for(Thread t : threads){
            t.join();
        }

        System.out.println(s1.returnCount());
        //synchronized를 사용하지 않을시 기대값인 10000이 나오지 않는 경우가 있음
    }
}
