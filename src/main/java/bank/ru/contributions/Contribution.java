package bank.ru.contributions;

import Interafce.ActionWithContribution;
import bank.ru.BankProduct;
import bank.ru.Currency;

public class Contribution extends BankProduct implements ActionWithContribution {
    public Contribution(long balance, Currency currency, String name) {
        super(balance, currency, name);
    }

    @Override
    public void close() {

    }

    @Override
    public String showBalance() {
        return null;
    }

    @Override
    public void replenishment(long amount) {

    }
}
