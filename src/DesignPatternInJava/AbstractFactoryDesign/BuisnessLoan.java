package DesignPatternInJava.AbstractFactoryDesign;

public class BuisnessLoan extends Loan{
    @Override
    void getRate(double r) {
        rate=r;
    }
}
