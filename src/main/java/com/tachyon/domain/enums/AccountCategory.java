package com.tachyon.domain.enums;

/*  accountCategory is:
    Cash;
    Bank;
    Other;
 */
public enum AccountCategory {
    CASH, BANK, OTHER;


    @Override
    public String toString() {
        return name();
    }
}
