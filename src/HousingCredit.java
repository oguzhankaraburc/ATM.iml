public class HousingCredit extends CreditTransactions{

    double housingInterestRate=1.33;
    @Override
    public void creditAmount() {
        System.out.println("Konut kredisi için çekmek istediğiniz kredi tutarını giriniz :");
    }

    public double getHousingInterestRate(){
        return housingInterestRate;
    }
}
