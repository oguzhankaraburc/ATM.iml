public class CardApplication {
    String name;
    String surname;
    String address;

    CardApplication(){
        this.name=name;
        this.surname=surname;
        this.address=address;
    }

    public String getName() {
        System.out.println("Lütfen İsminizi Giriniz: ");
        return name;
    }

    public String getSurname() {
        System.out.println("Lütfen Soyisminizi Giriniz: ");
        return surname;
    }

    public String getAddress() {
        System.out.println("Lütfen Adresinizi Giriniz: ");
        return address;
    }
}
