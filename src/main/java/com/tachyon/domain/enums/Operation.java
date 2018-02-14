package com.tachyon.domain.enums;

/*  operation is:
    income; +
    outcome; -
    transfer; from <--> to
 */
public enum Operation {
    INCOME, OUTCOME, TRANSFER;


    @Override
    public String toString() {
        return name();
    }
}
