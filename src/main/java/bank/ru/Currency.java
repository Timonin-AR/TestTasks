package bank.ru;

public enum Currency {

    DOLLAR("Доллар"), RUBLE("Рубль"), EURO("Евро");

    private String name;

    Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
