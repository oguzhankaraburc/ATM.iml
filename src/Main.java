import java.util.Scanner;


// Var olan kullanıcı idNumber=123456789
// Var olan kullanıcı password=123456
public class Main {
    public static void main(String[] args) {
        AccountHolder accountHolder = new AccountHolder();

        accountHolder.name = "Oğuzhan";
        accountHolder.surName = "Karaburç";
        System.out.println("Hoşgeldiniz lütfen bilgilerinizi giriniz.");


        if (accountHolder.getIdNumber() == 123456789L && accountHolder.getPassword() == 123456) {


        } else {
            System.out.println("Girdiğiniz bilgiler yanlıştır. Tekrar deneyiniz.");
            return;

        }

        System.out.println("//----------------------------------------------------------------//");
        System.out.println("Hoşgeldiniz " + accountHolder.name + " " + accountHolder.surName);

        AccountInfo accountInfo = new AccountInfo();
        accountInfo.getIban();
        accountInfo.getCustomernumber();
        accountInfo.getAccountAddress();
        accountInfo.getBalance();
        System.out.println("//----------------------------------------------------------------//");

        Transactions transactions = new Transactions();
        BankTransfer bankTransfer = new BankTransfer();
        CreditCartInformation creditCartInformation = new CreditCartInformation();
        VirtualCardInformation virtualCardInformation = new VirtualCardInformation();
        BankCardInformation bankCardInformation = new BankCardInformation();
        Payment payment = new Payment();
        GoldCurrency goldCurrency = new GoldCurrency();
        DollarCurrency dollarCurrency = new DollarCurrency();
        EuroCurrency euroCurrency = new EuroCurrency();
        Debt debt = new Debt();
        PersonalCredit personalCredit = new PersonalCredit();
        AgricultureCredit agricultureCredit = new AgricultureCredit();
        HousingCredit housingCredit = new HousingCredit();
        VehicleCredit vehicleCredit = new VehicleCredit();
        EducationCredit educationCredit = new EducationCredit();
        HealthInsurance healthInsurance = new HealthInsurance();
        CardApplication cardApplication = new CardApplication();
        ApplicationInquiry applicationInquiry = new ApplicationInquiry();
        ContactForm contactForm = new ContactForm();
        Scanner inputTransactions = new Scanner(System.in);
        Scanner inputBankTransfer = new Scanner(System.in);
        Scanner inputPayment = new Scanner(System.in);
        Scanner inputgetGold = new Scanner(System.in);
        Scanner inputgetDollar = new Scanner(System.in);
        Scanner inputgetEuro = new Scanner(System.in);
        Scanner inputPersonalCredit = new Scanner(System.in);
        Scanner inputAgricultureCredit = new Scanner(System.in);
        Scanner inputHousingCredit = new Scanner(System.in);
        Scanner inputVehicleCredit = new Scanner(System.in);
        Scanner inputEducationCredit = new Scanner(System.in);
        Scanner inputCardApplication = new Scanner(System.in);
        Scanner inputApplicationInguiry = new Scanner(System.in);
        Scanner inputContactForm = new Scanner(System.in);
        double currentBalance;
        System.out.println("Yapmak İstediğiniz İşlemi Seçiniz: \n 1-Para Çekme \n 2-Para Yatırma \n 3-Para Transferi \n 4-Borç Gösterme \n 5-Kredi Kartı Bilgileri \n 6-Sanal Kart bilgileri \n 7-Banka Kartı Bilgileri \n 8-Kredi ödemeleri \n 9-Altın Alma İşlemleri \n 10- Dolar Alma İşlemleri \n 11-Euro Alma İşlemleri \n 12-Bireysel Kredi \n 13-Tarım Kredisi \n 14- Konut Kredisi \n 15- Taşıt Kredisi \n 16-Eğitim Kredisi \n 17-Sağlık Sigortası Başvurusu    \n 18- Kart Başvurusu  \n 19-Başvuru Sorgulama \n 20-Müşteri İletişim Merkezi ");
        int choice = inputTransactions.nextInt();
        switch (choice) {
            case 1:
                accountInfo.getBalance();
                System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                transactions.withdrawMoney = inputTransactions.nextInt();
                currentBalance = accountInfo.balance - transactions.withdrawMoney;
                System.out.println("Çektiğiniz tutar: " + transactions.withdrawMoney);
                System.out.println("Güncel bakiyeniz : " + currentBalance);
                break;

            case 2:
                accountInfo.getBalance();
                System.out.println("Yatırmak istediğiniz tutarı giriniz:");
                transactions.loadMoney = inputTransactions.nextInt();
                currentBalance = accountInfo.balance + transactions.loadMoney;
                System.out.println("Güncel bakiyeniz : " + currentBalance);
                break;

            case 3:
                accountInfo.getBalance();
                System.out.println("Transfer Edeceğiniz İBAN'ı giriniz");
                bankTransfer.bankTransfer = inputBankTransfer.nextLine();
                System.out.println("Gönderilecek tutarı giriniz:");
                bankTransfer.moneyTransfer = inputBankTransfer.nextDouble();
                currentBalance = accountInfo.balance - bankTransfer.moneyTransfer;
                System.out.println("Transfer tamamlanmıştır.Güncel bakiyeniz : " + currentBalance);
                break;

            case 4:

                debt.getDebt();
                break;


            case 5:
                creditCartInformation.getCreditCardNumber();
                creditCartInformation.getCreditCardOwner();
                creditCartInformation.getCreditCardLimit();
                creditCartInformation.getCreationDate();
                break;

            case 6:
                virtualCardInformation.getVirtualCardNumber();
                virtualCardInformation.getVirtualCardOwner();
                virtualCardInformation.getVirtualCardLimit();
                virtualCardInformation.getCreationDate();
                break;


            case 7:
                bankCardInformation.getBankCardNumber();
                bankCardInformation.getBankCardOwner();
                bankCardInformation.getBankCardLimit();
                bankCardInformation.getCreationDate();
                break;


            case 8:
                currentBalance = accountInfo.getBalance() - debt.getDebt();
                System.out.println("Lütfen Ödemek istediğiniz tutarı giriniz: ");
                double debtpayment = inputPayment.nextDouble();
                currentBalance = accountInfo.balance - debtpayment;
                System.out.println("Ödemeniz onaylanmıştır güncel bakiyeniz: " + currentBalance);
                double currentBalance2 = debt.debt - debtpayment;
                System.out.println("Kalan borcunuz :" + currentBalance2);
                break;

            case 9:
                System.out.println("Altın Alış Fiyatı : " + goldCurrency.gold + "TL.");
                accountInfo.getBalance();
                System.out.println("Bakiyenizden altına yatırmak istediğiniz miktarı giriniz:");
                double amountDeposited = inputgetGold.nextDouble();
                double goldAmount = amountDeposited / goldCurrency.gold;
                currentBalance = accountInfo.balance - amountDeposited;

                System.out.println("Güncel altın döviziniz :" + goldAmount);

                System.out.println("Hesabınızda Kalan Bakiyeniz: " + currentBalance);
                break;

            case 10:
                System.out.println("Dolar Alış Fiyatı : " + dollarCurrency.dollar + "TL.");
                accountInfo.getBalance();
                System.out.println("Bakiyenizden dolara yatırmak istediğiniz miktarı giriniz:");
                double amountDeposited1 = inputgetDollar.nextDouble();
                double dollarAmount = amountDeposited1 / dollarCurrency.dollar;
                currentBalance = accountInfo.balance - amountDeposited1;

                System.out.println("Güncel dolar döviziniz :" + dollarAmount);

                System.out.println("Hesabınızda Kalan Bakiyeniz: " + currentBalance);
                break;


            case 11:
                System.out.println("Euro Alış Fiyatı : " + euroCurrency.euro + "TL.");
                accountInfo.getBalance();
                System.out.println("Bakiyenizden euro'ya yatırmak istediğiniz miktarı giriniz:");
                double amountDeposited2 = inputgetEuro.nextDouble();
                double euroAmount = amountDeposited2 / euroCurrency.euro;
                currentBalance = accountInfo.balance - amountDeposited2;
                System.out.println("Güncel euro döviziniz :" + euroAmount);
                System.out.println("Hesabınızda Kalan Bakiyeniz: " + currentBalance);
                break;


            case 12:
                personalCredit.creditAmount();
                double creditAmount = inputPersonalCredit.nextDouble();
                double payable = creditAmount * personalCredit.getPersonalInterestRate();
                System.out.println("Çekmek istediğiniz tutar karşılığında ödemeniz gereken tutar : " + payable + "TL.");
                System.out.println("Başvurunuz onaylandığında sms ile bilgilendireceğiz teşekkürler. ");
                break;


            case 13:
                agricultureCredit.creditAmount();
                creditAmount = inputAgricultureCredit.nextDouble();
                payable = creditAmount * agricultureCredit.getAgricultureInterestRate();
                System.out.println("Çekmek istediğiniz tutar karşılığında ödemeniz gereken tutar : " + payable + "TL.");
                System.out.println("Başvurunuz onaylandığında sms ile bilgilendireceğiz teşekkürler. ");
                break;


            case 14:

                housingCredit.creditAmount();
                creditAmount = inputHousingCredit.nextDouble();
                payable = creditAmount * housingCredit.getHousingInterestRate();
                System.out.println("Çekmek istediğiniz tutar karşılığında ödemeniz gereken tutar : " + payable + "TL.");
                System.out.println("Başvurunuz onaylandığında sms ile bilgilendireceğiz teşekkürler. ");
                break;


            case 15:
                vehicleCredit.creditAmount();
                creditAmount = inputVehicleCredit.nextDouble();
                payable = creditAmount * vehicleCredit.getVehicleInterestRate();
                System.out.println("Çekmek istediğiniz tutar karşılığında ödemeniz gereken tutar : " + payable + "TL.");
                System.out.println("Başvurunuz onaylandığında sms ile bilgilendireceğiz teşekkürler. ");
                break;


            case 16:
                educationCredit.creditAmount();
                creditAmount = inputEducationCredit.nextDouble();
                payable = creditAmount * educationCredit.getEducationInterestRate();
                System.out.println("Çekmek istediğiniz tutar karşılığında ödemeniz gereken tutar : " + payable + "TL.");
                System.out.println("Başvurunuz onaylandığında sms ile bilgilendireceğiz teşekkürler. ");
                break;


            case 17:
                healthInsurance.getHealtinsurance();
                System.out.println("Sağlık Sigortası başvurunuz alınmıştır detaylı bilgi için sms ile bilgilendirileceksiniz teşekkürler.");
                break;

            case 18:
                cardApplication.getName();
                inputCardApplication.nextLine();
                cardApplication.getSurname();
                inputCardApplication.nextLine();
                cardApplication.getAddress();
                inputCardApplication.nextLine();
                System.out.println("Başvurunuz onaylandığında sms ile bilgilendirileceksiniz teşekkürler.");
                break;

            case 19:
                applicationInquiry.getIdNumber();
                inputApplicationInguiry.nextLong();
                applicationInquiry.getCallNumber();
                inputAgricultureCredit.nextLong();
                System.out.println("Henüz onaylanan başvurunuz bulunmamaktadır.");
                break;

            case 20:
                System.out.println("Kayıp çalıntı bildirimlerinizi\n" +
                        "0250 231 00 00 Müşteri iletişim Merkezi’ne iletiniz.");
                contactForm.getApplicationType();
                inputContactForm.nextLine();
                contactForm.getName();
                inputContactForm.nextLine();
                contactForm.getSurname();
                inputContactForm.nextLine();
                contactForm.getIdNumber();
                inputContactForm.nextLong();
                contactForm.getCallNumber();
                inputContactForm.nextLong();
                contactForm.getRequest();
                System.out.println(inputContactForm.nextLine());

                break;

        }


    }
}