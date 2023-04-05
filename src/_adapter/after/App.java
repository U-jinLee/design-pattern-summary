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

        AccountService accountService2 = new AccountService();
        LoginHandler loginHandler2 = new LoginHandler(accountService2);
        String userName2 = loginHandler2.login("admin", "admin");
        System.out.println(userName2);
    }
}
