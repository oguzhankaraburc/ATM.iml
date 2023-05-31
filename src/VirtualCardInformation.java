public class VirtualCardInformation extends CreditCartInformation {

    String virtualCardNumber ="484812393";
    String virtualCardOwner ="Oğuzhan Karaburç";
    String virtualCardLimit = "5.000TL.";
    String creationDate="13.04.2022";

    public VirtualCardInformation(){
        this.virtualCardNumber = virtualCardNumber;
        this.virtualCardOwner = virtualCardOwner;
        this.virtualCardLimit = virtualCardLimit;
        this.creationDate=creationDate;
    }

    public void getVirtualCardNumber(){
        System.out.println("Sanal Kart Numarası: " + virtualCardNumber);
    }

    public void getVirtualCardOwner(){
        System.out.println("Sanal Kart Sahibi: "+ virtualCardOwner);
    }
    public void getVirtualCardLimit() {
        System.out.println("Sanal Kart limiti :" + virtualCardLimit);
    }
    @Override
    public void getCreationDate(){
        System.out.println("Sanal Kartın Oluşturulma Tarihi: " + creationDate);
    }

}
