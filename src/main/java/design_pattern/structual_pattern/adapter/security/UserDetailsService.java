package design_pattern.structual_pattern.adapter.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
