import java.util.Scanner;

public class AccountHolder {
    Scanner scanner = new Scanner(System.in);
    String name;
    String surName;

    long idNumber;

    long password;

    public AccountHolder() {

    }

    public long getIdNumber() {
        System.out.println("TC numaranız:");
        long idNumber = scanner.nextLong();
        return idNumber;
    }

    public long getPassword() {
        System.out.println("Şifrenizi Giriniz:");
        long password = scanner.nextLong();
        return password;
    }


}
