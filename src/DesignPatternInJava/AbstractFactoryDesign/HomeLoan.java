package DesignPatternInJava.AbstractFactoryDesign;

public class HomeLoan extends Loan{
    @Override
    void getRate(double r) {
        rate = r;
    }
}
