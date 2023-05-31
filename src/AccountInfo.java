public   class AccountInfo {

    String iban = "TR 04 0001 0023 2793 2518 0750 01";
    long customernumber = 23279425;
    String accountAddress = "Kartal/İSTANBUL Şubesi.";
    double balance = 10000;


    public AccountInfo() {
        this.iban = iban;
        this.customernumber = customernumber;
        this.accountAddress = accountAddress;
        this.balance = balance;

    }


    public String getIban() {
        System.out.println("İban: " + iban);
        return iban;
    }

    public long getCustomernumber() {
        System.out.println("Müşteri Numaranız: " + customernumber);
        return customernumber;
    }

    public String getAccountAddress() {
        System.out.println("Hesap Adresiniz: " + accountAddress);
        return accountAddress;
    }

    public double getBalance() {
        System.out.println("Güncel Bakiyeniz: " + balance);
        return balance;
    }


}
