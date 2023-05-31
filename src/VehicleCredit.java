public class VehicleCredit extends CreditTransactions {
    double vehicleInterestRate=1.31;
    @Override
    public void creditAmount() {
        System.out.println("Taşıt kredisi için çekmek istediğiniz kredi tutarını giriniz :");
    }

    public double getVehicleInterestRate(){
        return vehicleInterestRate;
    }
}
