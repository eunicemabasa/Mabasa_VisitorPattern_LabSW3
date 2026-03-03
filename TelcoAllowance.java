public class TelcoAllowance implements UsagePromo {

    @Override
    public String visit(Telco telco) {
        return telco.getTelcoName() + " offers " +
               telco.getDataAllowance() + "GB for ₱" +
               telco.getPromoPrice();
    }
}