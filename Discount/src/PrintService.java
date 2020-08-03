//zad. 28
//ćw. 1
public class PrintService {
    public void postSummary(Client client, double price, double priceDiscount){
        printMessage(client);
        printPrices(price, priceDiscount);
    }

    private void printMessage(Client client) {
        if (client.getLastName() == null)
            System.out.println("Witaj " + client.getFirstName());
        else if (client.getFirstName() == null)
            System.out.println("Dzień dobry panie/pani " + client.getLastName());
        else if (((client.getFirstName() == null) && (client.getLastName()) == null))
            System.out.println("Witaj nieznajomy");
    }

    private void printPrices(double price, double priceDiscount){
        System.out.println("Kwota przed rabatem: " + price);
        System.out.println("Do zapłaty (po rabacie): " + priceDiscount);
    }
}
