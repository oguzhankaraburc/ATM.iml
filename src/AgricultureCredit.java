public class AgricultureCredit extends CreditTransactions{
    double agricultureInterestRate=1.20;
    @Override
    public  void  creditAmount() {
        System.out.println("Tarım kredisi için çekmek istediğiniz kredi tutarını giriniz :");

    }
    public double getAgricultureInterestRate(){
        return agricultureInterestRate;
    }
}
