/**
 * 
 */

// BasePlusCommissionEmployee2 inherits from class CommissionEmployee.

public class BasePlusCommissionEmployee2 extends CommissionEmployee
{
   private double baseSalary; // base salary per week

   // six-argument constructor
   public BasePlusCommissionEmployee2( String first, String last, 
      String ssn, double sales, double rate, double salary )
   {
      // explicit call to superclass CommissionEmployee constructor
      super( first, last, ssn, sales, rate );

      setBaseSalary( salary ); // validate and store base salary
   } // end six-argument BasePlusCommissionEmployee2 constructor
   
   // set base salary
   public void setBaseSalary( double salary )
   {
      baseSalary = ( salary < 0.0 ) ? 0.0 : salary;
   } // end method setBaseSalary

   // return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   } // end method getBaseSalary

   // calculate earnings
   public double earnings()
   {
      // not allowed: commissionRate and grossSales private in superclass
      return baseSalary + ( getCommissionRate() * getGrossSales() );
   } // end method earnings

   // return String representation of BasePlusCommissionEmployee2
   public String toString()
   {
      // not allowed: attempts to access private superclass members   
      return String.format( 
         "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", 
         "base-salaried commission employee", getFirstName(), getLastName(), 
         "social security number", getSocialSecurityNumber(), 
         "gross sales", getGrossSales(), "commission rate", getCommissionRate(), 
         "base salary", baseSalary );
   } // end method toString
} // end class BasePlusCommissionEmployee2
