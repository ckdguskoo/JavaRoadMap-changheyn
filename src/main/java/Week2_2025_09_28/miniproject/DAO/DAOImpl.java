package Week2_2025_09_28.miniproject.DAO;



import Week2_2025_09_28.miniproject.DB.DBUtil;
import Week2_2025_09_28.miniproject.DTO.AccountDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOImpl implements AccountDAO{

    @Override //계좌 생성
    public void addAccount(AccountDTO accountDTO) {
        //System.out.println("계좌는 홍길동-1234-5678과 같은 형식이여야 합니다.");

        String sql = "INSERT into Bank (name, account, balance) values (?,?,?)";
        try(Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ){
            ps.setString(1, accountDTO.getName());
            ps.setInt(2, accountDTO.getAccount());
            ps.setInt(3, accountDTO.getBalance());
            int rs = ps.executeUpdate();


            if(rs>0) System.out.println("계좌 정보가 추가되었습니다\n");

        }catch(Exception e){
            System.out.println("계좌를 추가하는데 실패하였습니다.\n");
            System.out.println(e.getMessage());
        }

    }

    @Override //계좌 삭제
    public void deleteAccount(AccountDTO accountDTO) {
        String sql = "delete from Bank where name = ? and account = ?";
        try(Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ){
            ps.setString(1, accountDTO.getName());
            ps.setInt(2, accountDTO.getAccount());
            int rs = ps.executeUpdate();


            if (rs>0){
                System.out.println("계좌 정보가 삭제되었습니다\n");
            }else {
                System.out.println("삭제할 계좌를 찾을수 없습니다.\n");
            }
            
        }catch(Exception e){
            System.out.println("계좌 삭제 실패\n");
            System.out.println(e.getMessage());
        }
        
    }

    @Override //잔액조회
    public List<AccountDTO> checkAccount(int account)  {
        String sql = "SELECT * FROM Bank WHERE account LIKE ?";
        List<AccountDTO> accountList = new ArrayList<>();
        try( Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
          ){
            ps.setInt(1, account );
            try(ResultSet rs = ps.executeQuery()){
                while(rs.next()){
                    String name = rs.getString("name");
                    account = rs.getInt("account");
                    int balance = rs.getInt("balance");
                    accountList.add(new AccountDTO(name,account,balance));
                }
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return accountList;
    }

    @Override //거래내역 저장
    public void history(AccountDTO accountDTO) throws SQLException {

    }

    @Override //입금
    public void sendmoney(AccountDTO accountDTO) throws SQLException {

    }

    @Override //출금
    public void withdraw(AccountDTO accountDTO) throws SQLException {

    }
}
