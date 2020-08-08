//zad. 46
//ćw. 1
public class Apple extends Fruit {
    public static final String TYPE = "jabłkowaty";
    private String variety;

    public Apple(int weight, String variety) {
        super(weight, TYPE);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public void getInfo() {
        System.out.println("Jabłko: ");
        super.getInfo();
        System.out.print(", odmiana: " + getVariety());
    }
}
