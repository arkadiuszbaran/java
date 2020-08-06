//zad. 44
//ćw. 1
public class ExhaustPart extends Part {
    private boolean complianceStandard;

    public ExhaustPart(int serialNumber, String producer, String model, int productSeries, boolean complianceStandard) {
        setSerialNumber(serialNumber);
        setProducer(producer);
        setModel(model);
        setProductSeries(productSeries);
        this.complianceStandard = complianceStandard;
    }

    public boolean isComplianceStandard() {
        return complianceStandard;
    }

    public void setComplianceStandard(boolean complianceStandard) {
        this.complianceStandard = complianceStandard;
    }

    void printInfo() {
        System.out.println(getSerialNumber() + " " + getProducer() + " " + getModel() + " " + getProductSeries()
                + " " + isComplianceStandard());
    }
}
