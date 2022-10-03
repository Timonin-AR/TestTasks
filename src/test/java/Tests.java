import bank.ru.Currency;
import bank.ru.cards.CreditCard;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class Tests {

    @Test
    public void testCreditCard(){
        CreditCard creditCard = new CreditCard(100, Currency.RUBLE,"Коля");

        assertThat(creditCard.getBalance()).isEqualTo(100);
        assertThat(creditCard.getName()).isEqualTo("Коля");
        assertThat(creditCard.getCurrency().getName()).isEqualTo("Рубль");

        creditCard.replenishment(10);
        assertThat(creditCard.getBalance()).isEqualTo(110);

        creditCard.writeOff(90);
        assertThat(creditCard.getBalance()).isEqualTo(20);

       creditCard.writeOff(30);
       assertThat(creditCard.getBalance()).isEqualTo(20);

       assertThat(creditCard.showDebt()).contains("21.9");
       assertThat(creditCard.showBalance()).contains("20");

       creditCard.setCurrency(Currency.DOLLAR);
       assertThat(creditCard.getCurrency().getName()).isEqualTo("Доллар");

       creditCard.setName("Ваня");
       assertThat(creditCard.getName()).isEqualTo("Ваня");
    }

    @Test
    public void testDebitCard(){

    }
}
