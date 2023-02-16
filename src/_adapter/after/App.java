package _adapter.after;

import _adapter.after.Adapter.AccountUserDetailsService;
import _adapter.after.adaptee.AccountService;
import _adapter.after.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String userName = loginHandler.login("admin", "admin");
        System.out.println(userName);
    }
}
