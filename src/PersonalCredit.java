public class PersonalCredit extends CreditTransactions{
    double personalInterestRate=1.16;

    @Override
    public void creditAmount() {
        System.out.println("Bireysel kredi için çekmek istediğiniz kredi tutarını giriniz :");
    }

    public double getPersonalInterestRate(){
        return personalInterestRate;
    }



}
