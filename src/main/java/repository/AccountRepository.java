package repository;

import entity.Account;

import java.util.List;

public interface AccountRepository {
    public int save(Account account);
    public Account findById(long id);
    public int update(Account account);
    public int deleteById(long id);
    public List<Account> findAll();
}
