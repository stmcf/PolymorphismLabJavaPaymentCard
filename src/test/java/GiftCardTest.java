import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    private GiftCard giftCard;

    @Before
    public void setUp(){
        giftCard = new GiftCard("Howies", 100.00);
    }

    @Test
    public void canGetRetailer(){
        assertEquals("Howies", giftCard.getRetailer());
    }

    @Test
    public void canGetBalance(){
        assertEquals(100.00, giftCard.getBalance(), 0.01);
    }

    @Test
    public void canChargeCustomer(){
        giftCard.chargeCustomer(20.00);
        assertEquals(80.00, giftCard.getBalance(), 0.01);
    }





}
