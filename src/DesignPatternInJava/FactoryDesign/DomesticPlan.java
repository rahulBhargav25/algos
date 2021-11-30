package DesignPatternInJava.FactoryDesign;

import DesignPatternInJava.FactoryDesign.Plan;

public class DomesticPlan extends Plan {
    @Override
    void getRate() {
        rate=3.50;
    }
}
