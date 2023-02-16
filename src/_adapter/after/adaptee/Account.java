package _adapter.after.adaptee;

import _adapter.after.security.UserDetails;

/**
 * Adaptee를 건들 수 있다면 직접 오버라이드를 구현하는 방식
 * */
public class Account implements UserDetails {
    private String name;
    private String password;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getUsername() {
        return this.name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
