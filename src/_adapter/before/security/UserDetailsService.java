package _adapter.before.security;

public interface UserDetailsService {
    UserDetails loadUser(String userName);
}
