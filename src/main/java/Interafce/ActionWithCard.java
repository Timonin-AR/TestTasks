package Interafce;

import bank.ru.Currency;

public interface ActionWithCard {

    public void replenishment(long amount);
    public void writeOff (long amount);
    public String showBalance();


}
