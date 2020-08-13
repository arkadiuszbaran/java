//zad. 52
//ćw. 1

public enum Pizza {
    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true, true, false),
    PROSCIUTTO(true, true, false, true);

    private final boolean tomatoSauce;
    private final boolean cheese;
    private final boolean mushrooms;
    private final boolean ham;

    Pizza(boolean tomatoSauce, boolean cheese, boolean mushrooms, boolean ham) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
        this.ham = ham;
    }

    @Override
    public String toString() {
        String desc = name() + ": ";
        if (tomatoSauce)
            desc += "sos pomidorowy";
        if (cheese)
            desc += ", ser";
        if (mushrooms)
            desc += ", pieczarki";
        if (ham)
            desc += ", szynka";
        return desc;
    }
}
