/*
 * 
 */
package mx.itson.catrina.entities;

import com.google.gson.Gson;
import java.util.List;

/**
 *
 */
public class AccountInformation {
    private String account;
    private String clabe;
    private String currency;
    private Customer customer;
    private List<Transactions> transactions;

    public AccountInformation deserealize(String json){
        AccountInformation accountInformation = new AccountInformation();
         try {
             accountInformation = new Gson().fromJson(json, AccountInformation.class);
         }catch(Exception ex){
             System.err.print("Ocurrió un error: "+ ex.getMessage());
         }
         return accountInformation;
    }
    
    public AccountInformation() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transactions> transactions) {
        this.transactions = transactions;
    }
}
