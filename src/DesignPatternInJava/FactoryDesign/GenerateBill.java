package DesignPatternInJava.FactoryDesign;

import DesignPatternInJava.FactoryDesign.Plan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main(String[] args) throws IOException {
        GetPlanFactory gf = new GetPlanFactory();
        System.out.println("Enter the plan name");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planName = br.readLine();
        System.out.println("Enter number of units");
        int units = Integer.parseInt(br.readLine());
        Plan p = gf.getPlan(planName);

        System.out.println("Bill Amount For "+planName+" of "+units+" units is");

        p.getRate();
        p.calculateBill(units);
    }
}
