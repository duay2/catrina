/*
 * 
 */
package mx.itson.catrina.enums;

import com.google.gson.annotations.SerializedName;

/**
 *
 */
public enum TransactionType {
    @SerializedName("1")
    DEPOSIT(1),
    @SerializedName("2")
    WITHDRAWAL(2);
    
     private final int value;

    TransactionType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static TransactionType fromValue(int value) {
        for (TransactionType type : TransactionType.values()) {
            if (type.getValue() == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid TransactionType value: " + value);
    }

}

