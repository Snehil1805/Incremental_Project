// package com.wecp.progressive.service;

// import java.sql.SQLException;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

// import javax.persistence.EntityNotFoundException;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.wecp.progressive.entity.Accounts;
// import com.wecp.progressive.repository.AccountRepository;

// @Service("accountServiceImplJpa")
// public class AccountServiceImplJpa implements AccountService {
 
//     private List<Account> accounts = new ArrayList<>();
 
//     @Autowired
//     private AccountRepository accountRepository;
 
//     @Override
//     public List<Account> getAllAccounts() throws SQLException {
//         return accountRepository.findAll();
//     }
 
//     @Override
//     public List<Account> getAccountsByUser(int customerId) throws SQLException {
//         return accountRepository.findAllByCustomerId(customerId);
//     }
 
//     @Override
//     public Account getAccountById(int accountId) throws SQLException {
//         return accountRepository.findById(accountId).orElseGet(null);
//     }
 
//     @Override
//     public int addAccount(Account account) throws SQLException {
//         return accountRepository.save(account).getAccountId();
//     }
 
//     @Override
//     public void updateAccount(Account account) throws SQLException {
//         int accountId = account.getAccountId();
//         Account accountToUpdate = accountRepository.findById(accountId).orElseThrow(
//                 () -> new EntityNotFoundException("Account not found with id: " + accountId));
 
//         if (accountToUpdate != null) {
//             accountToUpdate.setBalance(account.getBalance());
//             accountToUpdate.setCustomerId(account.getCustomerId());
 
//             accountRepository.save(accountToUpdate);
//         }
//     }
 
//     @Override
//     public void deleteAccount(int accountId) throws SQLException {
//         accountRepository.deleteById(accountId);
//     }
 
//     @Override
//     public List<Account> getAllAccountsSortedByBalance() throws SQLException {
//         return accountRepository.findAllByOrderByBalanceAsc();
//     }
 
//     /************************ ArrayList methods below ********************/
 
//     @Override
//     public List<Account> getAllAccountsFromArrayList() {
//         return accounts;
//     }
 
//     @Override
//     public List<Account> addAccountToArrayList(Account account) {
//         accounts.add(account);
//         return accounts;
//     }
 
//     @Override
//     public List<Account> getAllAccountsSortedByBalanceFromArrayList() {
//         Collections.sort(accounts);
//         return accounts;
//     }
 
//     @Override
//     public void emptyArrayList() {
//         accounts.clear();
//     }
 
//}

