package Week2_2025_09_28.miniproject.Main;


import Week2_2025_09_28.miniproject.DAO.DAOImpl;
import Week2_2025_09_28.miniproject.DTO.AccountDTO;
import Week2_2025_09_28.miniproject.service.CheckMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DAOImpl dao = new DAOImpl();
        Scanner sc = new Scanner(System.in);
        CheckMethod checkMethod = new CheckMethod();

        while(true) {
            System.out.println("실행시킬 메뉴를 입력해주세요");
            System.out.println("===== XX은행 =====");
            System.out.println("1. 계좌 추가");
            System.out.println("2. 계좌 삭제");
            System.out.println("3. 계좌 정보 조회");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("본인 이름을 입력해주세요");
                    String name = sc.nextLine();
                    System.out.println("사용하실 계좌 번호를 입력해 주세요");
                    int account = sc.nextInt();
                    sc.nextLine();
                    System.out.println("입금하실 금액을 입력해주세요");
                    int balance = sc.nextInt();
                    dao.addAccount(new AccountDTO(name, account, balance));
                    continue;

                case 2:
                    System.out.println("본인 이름을 입력해주세요");
                    String name2 = sc.nextLine();
                    System.out.println("삭제하실 계좌번호를 입력해주세요");
                    int account2 = sc.nextInt();
                    sc.nextLine();

                    System.out.println("정말 계좌를 삭제 하시겠습니까?");
                    System.out.println("계좌를 삭제하시려면 \"삭제한다\"를 입력해주세요.");
                    String check = sc.nextLine();

                    if (checkMethod.check(check)) {
                        dao.deleteAccount(new AccountDTO(name2, account2));
                    }
                    continue;

                case 3:
                    System.out.println("조회하실 계좌의 계좌번호를 입력해주세요");
                    int account3 = sc.nextInt();
                    sc.nextLine();
                    System.out.println(dao.checkAccount(account3));
            }
        }



    }
}
