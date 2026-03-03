public interface TelcoSubscription {
    String getTelcoName();
    int getDataAllowance();
    double getPromoPrice();
    boolean hasUnliCallText();

    String accept(UsagePromo promo);
    String accept(UnliCallOffer offer);
}