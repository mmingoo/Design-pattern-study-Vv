package design_pattern.structual_pattern.adapter;

import design_pattern.structual_pattern.adapter.adapterClass.AccountUserDetails;
import design_pattern.structual_pattern.adapter.adapterClass.AccountUserDetailsService;
import design_pattern.structual_pattern.adapter.security.LoginHandler;
import design_pattern.structual_pattern.adapter.security.UserDetailsService;

public class Client {
    public static void main(String[] args) {

        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("keesun", "keesun");
        System.out.println(login);
    }
}
