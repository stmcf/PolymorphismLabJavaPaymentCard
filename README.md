# PolymorphismLabJavaPaymentCard

An online retailer wants you to model the payment system for their online customers. They want an `OnlineAccount` class to keep track of a customer's name, payment methods (different payment cards), and a collection of 'transaction fees'.

Different types of payment cards will log charges differently, and keep track of spending differently - as well as incur a different 'transaction fee'. `CreditCard` and `DebitCard` should inherit from a `PaymentCard` class.

`CreditCard`:
- when charged will add the cost of the purchase to a collection of charges and reduce the cards credit limit by the cost.
- when asked for the transaction fee for a specific cost will return (2 * 'risk multiplier')% of the transaction cost. The 'risk multiplier' is dependent on a constructor argument.

`DebitCard`:
- when charged will add the cost of the purchase to a collection of charges.
- when asked for the transaction fee for a specific cost will return a fixed 2% of the cost.

`GiftCard`:
- when charged will reduce a balance stored on the gift card, passed in when the instance of `GiftCard` is created.
- when asked for a transaction fee for a specific cost will return 0 (zero).

<hr>

- In order for the `OnlineAccount` to store payment methods, get transaction fees, and charge cards in a DRY way: cards should in some way implement an `IChargeable` interface:
```java
public interface IChargeable {
    double getTransactionFee(double purchaseAmount);
    void charge(double purchaseAmount);
}
```

- Please build your solution using TDD.
- Planning is vital for this task, as a solution can get overly-complicated very easily.

<hr>

