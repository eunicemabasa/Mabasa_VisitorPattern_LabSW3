public class UnliCallTextPackage implements UnliCallOffer {

    @Override
    public String visit(Telco telco) {
        if (telco.hasUnliCallText()) {
            return telco.getTelcoName() + " includes unlimited calls and texts.";
        } else {
            return telco.getTelcoName() + " does NOT include unlimited calls and texts.";
        }
    }
}