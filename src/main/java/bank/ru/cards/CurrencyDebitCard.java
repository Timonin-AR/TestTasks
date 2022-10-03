package bank.ru.cards;

import Interafce.ActionWithCard;
import bank.ru.BankProduct;
import bank.ru.Currency;

public class CurrencyDebitCard extends BankProduct implements ActionWithCard {
    public CurrencyDebitCard(long balance, Currency currency, String name) {
        super(balance, currency, name);
    }

    @Override
    public void replenishment(long amount) {

    }

    @Override
    public void writeOff(long amount) {

    }

    @Override
    public String showBalance() {
    return "adf";
    }
}
