package com.wecp.progressive.entity;
import java.util.Date;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
import org.springframework.context.annotation.Primary;
 
import net.bytebuddy.utility.GraalImageCode;
 
// @Entity
// @Table(name = "transactions")
public class Transactions {
    // @Id
    // @Column(name ="transaction_id" )
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private int transactionId;
   
    // @ManyToOne
    // @JoinColumn(name = "account_id",nullable = false)
    // private Accounts accounts;
    private int accountId;
 
    // @Column(name = "amount",nullable = false)
    private Double amount;
 
    // @Column(name = "transaction_date",nullable = false)
    private Date transactionDate;
 
    // @Column(name = "transaction_type",nullable = false)
    private String transactionType;
   
 
    public Transactions() {
    }
 
    public Transactions(int transactionId, int accountId, Double amount, Date timeStamp, String transactionType) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.amount = amount;
        this.transactionDate = timeStamp;
        this.transactionType = transactionType;
    }
 
    public int getTransactionId() {
        return transactionId;
    }
 
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
 
    public int getAccountId() {
        return accountId;
    }
 
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
 
    public Double getAmount() {
        return amount;
    }
 
    public void setAmount(Double amount) {
        this.amount = amount;
    }
 
    public Date getTransactionDate() {
        return transactionDate;
    }
 
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
 
    public String getTransactionType() {
        return transactionType;
    }
 
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}