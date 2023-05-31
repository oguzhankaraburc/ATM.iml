public class ApplicationInquiry {
    long idNumber;
    long callNumber;

    ApplicationInquiry(){
        this.idNumber=idNumber;
        this.callNumber=callNumber;
    }


    public long getIdNumber() {
        System.out.println("Lütfen Tc numaranızı giriniz: ");
        return idNumber;
    }

    public long getCallNumber() {
        System.out.println("Lütfen Telefon Numaranızı Giriniz: ");
        return callNumber;
    }
}
