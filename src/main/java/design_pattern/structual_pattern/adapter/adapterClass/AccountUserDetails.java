package design_pattern.structual_pattern.adapter.adapterClass;


import design_pattern.structual_pattern.adapter.anotherClass.Account;
import design_pattern.structual_pattern.adapter.security.UserDetails;

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
