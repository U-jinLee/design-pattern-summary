package _adapter.after.Adapter;

import _adapter.after.adaptee.Account;
import _adapter.after.adaptee.AccountService;
import _adapter.after.security.UserDetails;
import _adapter.after.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    //adaptee
    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String userName) {
        Account account = accountService.findByUserName(userName);
        return new AccountUserDetails(account);
    }

}
