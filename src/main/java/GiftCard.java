public class GiftCard {

    private String retailer;
    private Double balance;

    public GiftCard(String retailer, Double balance){
        this.retailer = retailer;
        this.balance = balance;
    }

    public String getRetailer(){
        return this.retailer;
    }
     public double getBalance(){
        return this.balance;
     }

     public void chargeCustomer(Double chargedAmount){
        this.balance -= chargedAmount;
     }
}
