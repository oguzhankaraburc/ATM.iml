public class ContactForm {
    String applicationType;
    String name;
    String surname;
    long idNumber;
    long callNumber;
    String request;


    public ContactForm(){
        this.applicationType=applicationType;
        this.name=name;
        this.surname=surname;
        this.idNumber=idNumber;
        this.callNumber=callNumber;
        this.request=request;


    }

    public String getApplicationType() {
        System.out.println("Başvuru Konusunu Yazınız: ");
        return applicationType;
    }

    public String getName() {
        System.out.println("Lütfen isminizi giriniz: ");
        return name;
    }

    public String getSurname() {
        System.out.println("Lütfen soyisminizi giriniz: ");
        return surname;
    }

    public long getIdNumber() {
        System.out.println("Lütfen Tc numaranızı giriniz: ");
        return idNumber;
    }

    public long getCallNumber() {
        System.out.println("Lütfen Telefon Numaranızı Giriniz: ");
        return callNumber;
    }

    public String getRequest() {
        System.out.println("Lütfen talebinizi giriniz: ");
        return request;
    }



}
