package design_pattern.structual_pattern.adapter.adapterClass.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
