package bank.ru;

public abstract class BankProduct {
    private long balance;
    private Currency currency;
    private String name;

    public BankProduct(long balance, Currency currency, String name) {
        this.balance = balance;
        this.currency = currency;
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getName() {
        return name;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setName(String name) {
        this.name = name;
    }


}
