package Week2_2025_09_28.Thread;

public class SynchronizedExam {
    private int count = 0;

    public synchronized void plus() { // 동기화된 메서드
        count++;

    }

    public synchronized int returnCount() {
        return count;
    }
}
