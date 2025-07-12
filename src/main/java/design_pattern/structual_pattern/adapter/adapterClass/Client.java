package design_pattern.structual_pattern.adapter.adapterClass;


import design_pattern.structual_pattern.adapter.adapterClass.security.LoginHandler;
import design_pattern.structual_pattern.adapter.adapterClass.security.UserDetailsService;

public class Client {
    public static void main(String[] args) {

        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("keesun", "keesun");
        System.out.println(login);
    }
}
