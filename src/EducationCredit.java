public class EducationCredit extends CreditTransactions{
    double educationInterestRate=1.31;
    @Override
    public void creditAmount() {
        System.out.println("Eğitim kredisi için çekmek istediğiniz kredi tutarını giriniz :");
    }

    public double getEducationInterestRate(){
        return educationInterestRate;
    }
}
