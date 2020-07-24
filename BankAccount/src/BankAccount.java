public class BankAccount {
    public static void main(String[] args) {
        System.out.println("Osoba 1:");

        Adress adress1 = new Adress();
        adress1.street = "Warszawska";
        adress1.numberHouse = 10;
        adress1.numberApartament = 11;
        adress1.city = "Gdańsk";
        adress1.postalCode = "43-123";

        Person person1 = new Person();
        person1.firstName = "Tadeusz";
        person1.lastName = "Mały";
        person1.pesel = "911111111111";
        person1.adressRegistred = adress1;
        person1.adressLiving = adress1;

        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.cashBorrowed = 12_000;
        credit1.cashReturned = 4_000;
        credit1.interestRate = 0.14;
        credit1.termMonths = 8;

        Account account1 = new Account();
        account1.owner = person1;
        account1.balance = 21_000;
        account1.interestRate = 0.007;

        System.out.println(person1.firstName + " " + person1.lastName);
        System.out.print("Adres zamieszkania: ");
        System.out.println(person1.adressLiving.street + " " + person1.adressLiving.numberHouse + "/"
                + person1.adressLiving.numberApartament + ", " + person1.adressLiving.postalCode + " "
                + person1.adressLiving.city);
        System.out.print("Stan konta: ");
        System.out.println(account1.balance + " zł");
        System.out.print("Kwota kredytu: ");
        System.out.println(credit1.cashBorrowed + " zł");
        System.out.print("Kwota zwrócona: ");
        System.out.println(credit1.cashReturned + " zł\n");


        System.out.println("Osoba 2:");

        Adress adress2 = new Adress();
        adress2.street = "Księżycowa";
        adress2.numberHouse = 7;
        adress2.numberApartament = 22;
        adress2.city = "Tomaszów Mazowiecki";
        adress2.postalCode = "02-414";

        Adress adress2_1 = new Adress();
        adress2_1.street = "Mocarna";
        adress2_1.numberHouse = 21;
        adress2_1.numberApartament = 55;
        adress2_1.city = "Tomaszów Mazowiecki";
        adress2_1.postalCode = "02-412";

        Person person2 = new Person();
        person2.firstName = "Michał";
        person2.lastName = "Potężny";
        person2.pesel = "92012311111";
        person2.adressRegistred = adress2;
        person2.adressLiving = adress2_1;

        Credit credit2 = new Credit();
        credit2.borrower = person2;
        credit2.cashBorrowed = 45_000;
        credit2.cashReturned = 13_000;
        credit2.interestRate = 0.11;
        credit2.termMonths = 12;

        Account account2 = new Account();
        account2.owner = person2;
        account2.balance = 55_000;
        account2.interestRate = 0.008;

        System.out.println(person2.firstName + " " + person2.lastName);
        System.out.print("Adres zamieszkania: ");
        System.out.println(person2.adressLiving.street + " " + person2.adressLiving.numberHouse + "/"
                + person2.adressLiving.numberApartament + ", " + person2.adressLiving.postalCode + " "
                + person2.adressLiving.city);
        System.out.print("Stan konta: ");
        System.out.println(account2.balance + " zł");
        System.out.print("Kwota kredytu: ");
        System.out.println(credit2.cashBorrowed + " zł");
        System.out.print("Kwota zwrócona: ");
        System.out.println(credit2.cashReturned + " zł");
    }
}
