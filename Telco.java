public class Telco implements TelcoSubscription {

    private int dataAllowance;
    private double promoPrice;
    private String telcoName;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public String getTelcoName() {
        return telcoName;
    }

    @Override
    public int getDataAllowance() {
        return dataAllowance;
    }

    @Override
    public double getPromoPrice() {
        return promoPrice;
    }

    @Override
    public boolean hasUnliCallText() {
        return unliCallText;
    }

    @Override
    public String accept(UsagePromo promo) {
        return promo.visit(this);
    }

    @Override
    public String accept(UnliCallOffer offer) {
        return offer.visit(this);
    }
}