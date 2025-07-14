package design_pattern.structual_pattern.adapter.adapterClass;

import design_pattern.structual_pattern.adapter.anotherClass.Account;
import design_pattern.structual_pattern.adapter.anotherClass.AccountService;
import design_pattern.structual_pattern.adapter.security.UserDetails;
import design_pattern.structual_pattern.adapter.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    private AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }


    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);

        return new AccountUserDetails(account);
    }


}
