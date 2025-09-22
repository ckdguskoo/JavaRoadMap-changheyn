package Week1_2025_09_21_Start.InterfaceExam;

public class TvExam implements InterFaceExam{
    @Override
    public void turnOn() {
        System.out.println("Tv를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv를 끕니다");
    }

    public static void main(String[] args) {
        TvExam tvExam = new TvExam();
        tvExam.turnOn();
        tvExam.turnOff();
        System.out.println(tvExam.MIN_VOLUME);
        System.out.println(tvExam.MAX_VOLUME);
    }
}
