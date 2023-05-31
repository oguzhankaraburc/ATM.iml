public class CreditCartInformation {
    String creditCardNumber = "4345 4234 2343 2344 4324";
    String creditCardOwner = "Oğuzhan Karaburç";
    String creditCardLimit = "6.900,00TL.";
    String creationDate = "30.12.2022";


    public CreditCartInformation() {
        this.creditCardNumber = creditCardNumber;
        this.creditCardOwner = creditCardOwner;
        this.creditCardLimit = creditCardLimit;
        this.creationDate = creationDate;

    }

    public void getCreditCardNumber() {
        System.out.println("Kredi Kartı Numarası: " + creditCardNumber);
    }

    public void getCreditCardOwner() {
        System.out.println("Kredi Kartı Sahibi: " + creditCardOwner);
    }

    public void getCreditCardLimit() {
        System.out.println("Kredi Kartı limiti :" + creditCardLimit);
    }

    public void getCreationDate() {
        System.out.println("Kartın Oluşturulma Tarihi: " + creationDate);
    }


}
