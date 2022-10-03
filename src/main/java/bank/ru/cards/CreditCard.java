package bank.ru.cards;

import Interafce.ActionWithCard;
import bank.ru.BankProduct;
import bank.ru.Currency;

public class CreditCard extends BankProduct implements ActionWithCard {

    float interestRate = 9.5f;

    public CreditCard(long balance, Currency currency, String name) {
        super(balance, currency, name);
    }

    @Override
    public void replenishment(long amount) {
        setBalance(getBalance() + amount);
        System.out.println("Зачислено: " + amount + " Баланс счета:" + getBalance());
    }


    @Override
    public void writeOff(long amount) {
        if (getBalance() > amount) {
            setBalance(getBalance() - amount);
            System.out.println("Списано: " + amount + " Баланс счета:" + getBalance());
        } else {
            System.out.println("Недостаточно средств");
        }

    }

    @Override
    public String showBalance() {
        return "Баланс: "+ getBalance() + " в "+ getCurrency().getName();
        }


    public String showDebt(){
        return "Задолность по карте: "+ (getBalance()+(getBalance()*interestRate)/100);
    }

}
