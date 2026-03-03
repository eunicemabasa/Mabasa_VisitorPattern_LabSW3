public interface UsagePromo {
    String visit(Telco telco);

    default String showAllowance(String telcoName, double price) {
        return telcoName + " offers " + price + " pesos worth of data usage.";
    }
}