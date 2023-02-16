package _adapter.after.adaptee;

import _adapter.after.security.UserDetails;
import _adapter.after.security.UserDetailsService;

/**
 * Adaptee를 건들 수 있다면 직접 오버라이드를 구현하는 방식
 * */
public class AccountService implements UserDetailsService {

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

    @Override
    public UserDetails loadUser(String userName) {
        return findByUserName(userName);
    }
}
