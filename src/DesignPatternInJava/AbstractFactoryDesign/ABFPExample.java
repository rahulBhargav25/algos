package DesignPatternInJava.AbstractFactoryDesign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABFPExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the bank");
        String bankName = br.readLine();
        System.out.println("Enter loan type");
        String loanName = br.readLine();
        AbstractFactory bankFactory = FactoryCreator.getFactory("BANK");
        Bank b = bankFactory.getBank(bankName);

        System.out.println("Enter the interest rate for "+b.getBankName());

        double rate = Double.parseDouble(br.readLine());
        System.out.println("Enter the amount of loan you want ?");
        double loanAmount = Double.parseDouble(br.readLine());
        System.out.println("ENter number of years you want loan for");
        int  years = Integer.parseInt(br.readLine());
        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l = loanFactory.getLoan(loanName);
        l.getRate(rate);
        l.calculateLoanPayment(loanAmount,years);

    }
}
