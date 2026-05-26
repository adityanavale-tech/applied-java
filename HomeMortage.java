
public class HomeMortage {

    public static void main(String[] args) {
    int principal = 600000;
    double interest = 0.05;
    double interestDown = 0.2;
    double downPayment = (principal * interestDown);
    double newPrincepal = principal - downPayment;
    int rent = 3500;
    int time = 30; //years
    // Amount Pxrxt + princapal
    double interestOnHouse = (newPrincepal * interest * time); //after 30 years
    double interestOnHouseMonth = (interestOnHouse/30)/12;
    double totalCost = interestOnHouse + principal;
    System.out.println("Interest on House(after down payment) = " + interestOnHouse);
    System.out.println("Total Cost = " + totalCost);
    System.out.println("Rental Cost = " + (rent * (time*12)));
    System.out.println("Monthly Intesest Payment = " + interestOnHouseMonth);

    }
// public void meow(){

// }
}