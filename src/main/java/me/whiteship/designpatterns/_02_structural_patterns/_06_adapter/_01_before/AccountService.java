package me.whiteship.designpatterns._02_structural_patterns._06_adapter._01_before;

public class AccountService {
	
	/**
	 * 서로 다른 인터페이스를 가진 것을 중간 매개체로 호환하는 방법
	 * 
	 * @param username
	 * @return
	 */
	
    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

}
