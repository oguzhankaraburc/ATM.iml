public class BankCardInformation  extends  CreditCartInformation{

    String bankCardNumber = "2342347";
    String bankCardOwner = "Oğuzhan Karaburç";
    String bankCardLimit = "1.000TL.";
    String creationDate = "20.04.2022";
    public BankCardInformation() {
        this.bankCardNumber = bankCardNumber;
        this.bankCardOwner = bankCardOwner;
        this.bankCardLimit = bankCardLimit;
        this.creationDate = creationDate;
    }


    public void getBankCardNumber() {
        System.out.println("Banka Kartı Numarası: " + bankCardNumber);
    }

    public void getBankCardOwner() {
        System.out.println("Banka Kartı Sahibi: " + bankCardOwner);

    }

    public void getBankCardLimit() {
        System.out.println("Banka Kartı Limiti: " + bankCardLimit);

    }

    @Override
    public  void getCreationDate() {
        System.out.println("Banka Kartının Oluşturulma Tarihi: " + creationDate);

    }


}
