//zad. 44
//ćw. 1
public class Part {
    private int serialNumber;
    private String producer;
    private String model;
    private int productSeries;

//    public Part(int serialNumber, String producer, String model, int productSeries) {
//        this.serialNumber = serialNumber;
//        this.producer = producer;
//        this.model = model;
//        this.productSeries = productSeries;
//    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductSeries() {
        return productSeries;
    }

    public void setProductSeries(int productSeries) {
        this.productSeries = productSeries;
    }
}
