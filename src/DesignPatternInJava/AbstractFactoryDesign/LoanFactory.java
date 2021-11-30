package DesignPatternInJava.AbstractFactoryDesign;

public class LoanFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        if(loan==null) {return null;}
        if(loan.equalsIgnoreCase("HOME")) {
            return new HomeLoan();
        } else if(loan.equalsIgnoreCase("Buisness")) {
            return new BuisnessLoan();
        } else if(loan.equalsIgnoreCase("Education")) {
            return new EducationLoan();
        }
        return null;
    }
}
