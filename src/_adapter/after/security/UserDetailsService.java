package _adapter.after.security;

public interface UserDetailsService {
    UserDetails loadUser(String userName);
}
