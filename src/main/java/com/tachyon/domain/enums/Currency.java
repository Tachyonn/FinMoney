package com.tachyon.domain.enums;

/*  currency is:
    USD;
    EUR;
    UAH;
    RUB;
 */

public enum Currency {
    USD, EUR, UAH, RUB;


    @Override
    public String toString() {
        return name();
    }
}
