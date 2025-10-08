package Week2_2025_09_28.miniproject.DTO;

public class AccountDTO {
    private String name;
    private int account;
    private int balance;

    public AccountDTO(String name ,int account, int balance) {
        this.name = name;
        this.account = account;
        this.balance = balance;
    }

    public AccountDTO(String name, int account) {
        this.name = name;
        this.account = account;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "이름 : "+name+"\t계좌번호 : "+ account +"\t 잔액 : "+balance;
    }
}
