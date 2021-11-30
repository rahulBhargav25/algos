package DesignPatternInJava.AbstractFactoryDesign;

public class EducationLoan extends Loan{
    @Override
    void getRate(double r) {
        rate=r;
    }
}
