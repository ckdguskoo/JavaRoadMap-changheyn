package Week2_2025_09_28.miniproject.service;

public class CheckMethod {
    public boolean check(String checkdel){ //삭제 확인
        boolean re = false;
        if (checkdel.equals("삭제한다")){
            re = true;
        }
        return re;
    }



}
