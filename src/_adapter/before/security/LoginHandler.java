package _adapter.before.security;

public class LoginHandler {
    UserDetailsService userDetailsService;

    public LoginHandler(UserDetailsService service) {
        this.userDetailsService = service;
    }

    public String login(String userName, String password) {
        UserDetails userDetails = userDetailsService.loadUser(userName);
        if(userDetails.getPassword().equals(password)) {
            return userDetails.getUsername();
        } else {
            throw new IllegalArgumentException();
        }
    }

}
