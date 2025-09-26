package Week1_2025_09_21_Start.UpcaseDowncaseExam;

public class CastingExam {
    public static void main(String[] args) {
        Person person = new Person();
        person.유산();
        //person.소비(); 얜 당연히 안되고..

        Person person1 = new Child(); //업캐스팅 (자동)
        person1.유산();
        //person1.소비() 자식 메서드 사용 불가능

        Child c = (Child)person1; //다운캐스팅 (명시적)
        c.유산();
        c.소비();
    }
}
