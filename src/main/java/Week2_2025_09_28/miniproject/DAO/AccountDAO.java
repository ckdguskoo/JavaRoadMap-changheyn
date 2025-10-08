package Week2_2025_09_28.miniproject.DAO;


import Week2_2025_09_28.miniproject.DTO.AccountDTO;

import java.sql.SQLException;
import java.util.List;

public interface AccountDAO {
    public void addAccount(AccountDTO accountDTO) throws SQLException; //계좌 생성   //사용하는쪽에서 예외처리
    public void deleteAccount(AccountDTO accountDTO) throws SQLException;
    public List<AccountDTO> checkAccount(int account) throws SQLException; //잔액 조회
    public void history(AccountDTO accountDTO) throws SQLException; //거래내역 저장
    public void sendmoney(AccountDTO accountDTO) throws SQLException; //입금
    public void withdraw(AccountDTO accountDTO) throws SQLException; //출금
}
