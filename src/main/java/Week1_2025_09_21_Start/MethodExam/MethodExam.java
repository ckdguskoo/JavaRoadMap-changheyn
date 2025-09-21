package Week1_2025_09_21_Start.MethodExam;

import java.util.Scanner;

public class MethodExam extends PactorialMethod{
    public static void main(String[] args) {
        PactorialMethod pm = new PactorialMethod();
        Scanner sc = new Scanner(System.in);

        //System.out.println(pm.Pactorial(sc.nextInt()));

        pm.pivonach(sc.nextInt());
    }
}
