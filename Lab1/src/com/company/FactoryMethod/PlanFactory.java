package com.company.FactoryMethod;

import com.company.FactoryMethod.plans.CommercialPlan;
import com.company.FactoryMethod.plans.DomesticPlan;
import com.company.FactoryMethod.plans.InstitutionalPlan;
import com.company.FactoryMethod.plans.Plan;

public class PlanFactory {

    public Plan getPlan(String planType){
        if (planType == null) {
            return null;
        }
        else if (planType.equalsIgnoreCase("CASUAL")){
            return new DomesticPlan();
        }
        else if (planType.equalsIgnoreCase("COMMERCIAL")){
            return new CommercialPlan();
        }
        else if (planType.equalsIgnoreCase("INSTITUTIONAL")){
            return new InstitutionalPlan();
        }
        return null;
    }
}
