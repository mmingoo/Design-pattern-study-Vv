package design_pattern.structual_pattern.adapter.adapterClass;

import design_pattern.structual_pattern.adapter.Account;
import design_pattern.structual_pattern.adapter.AccountService;
import design_pattern.structual_pattern.adapter.security.UserDetails;
import org.apache.catalina.User;

public class AccountUserDetails implements UserDetails {
    private Account account;
    public AccountUserDetails(Account account){
        this.account = account;
    }


    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
