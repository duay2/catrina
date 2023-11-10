/*
 * 
 */
package mx.itson.catrina.entities;

import java.util.Date;
import mx.itson.catrina.enums.TransactionType;

/**
 *
 */
public class Transactions {
    Date date;
    private String description;
    private double amount;
    private TransactionType type;

    public Transactions() {
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }
}
