package _adapter.before.adaptee;

public class AccountService {

    public Account findByUserName(String userName) {
        Account account = new Account();
        account.setName(userName);
        account.setPassword(userName);
        account.setEmail(userName);
        return account;
    }

    public void createNewAccount() {

    }

    public void updateAccount() {

    }
}
