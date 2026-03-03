public interface UnliCallOffer {
    String visit(Telco telco);

    default String showUnliCallsTextOffer(String telcoName, boolean unli) {
        if (unli) {
            return telcoName + " offers unlimited calls and texts.";
        } else {
            return telcoName + " does NOT offer unlimited calls and texts.";
        }
    }
}