package Week1_2025_09_21_Start.ExceptionExam;

    public class ThorwsExam {
        public static void main(String[] args) {
            int i = 10;
            int j= 0;
            try{
                int k = divde(i,j);
            }catch (ArithmeticException e){
                e.printStackTrace(); //자세한 위치까지 출력
            }

        }

        public static int divde(int i, int j) throws ArithmeticException {
            int k = i/j;
            return k;
        }
    }


