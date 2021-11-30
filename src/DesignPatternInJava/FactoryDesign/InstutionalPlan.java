package DesignPatternInJava.FactoryDesign;

import DesignPatternInJava.FactoryDesign.Plan;

public class InstutionalPlan extends Plan {
    @Override
    void getRate() {
        rate = 5.50;
    }
}
