/**
 * 
 */

// Testing class BasePlusCommissionEmployee3.

public class BasePlusCommissionEmployeeTest3 
{
   public static void main( String args[] ) 
   {
      // instantiate BasePlusCommissionEmployee3 object
      BasePlusCommissionEmployee3 basePlusCommissionEmployee = 
         new BasePlusCommissionEmployee3( 
         "Bob", "Lewis", "333-33-3333", 5000, .04, 300 );
      
      // get base-salaried commission employee data
      System.out.println( 
         "Employee information obtained by get methods: \n" );
      System.out.printf( "%s %s\n", "First name is",
         basePlusCommissionEmployee.getFirstName() );
      System.out.printf( "%s %s\n", "Last name is", 
         basePlusCommissionEmployee.getLastName() );
      System.out.printf( "%s %s\n", "Social security number is", 
         basePlusCommissionEmployee.getSocialSecurityNumber() );
      System.out.printf( "%s %.2f\n", "Gross sales is", 
         basePlusCommissionEmployee.getGrossSales() );
      System.out.printf( "%s %.2f\n", "Commission rate is",
         basePlusCommissionEmployee.getCommissionRate() );
      System.out.printf( "%s %.2f\n", "Base salary is",
         basePlusCommissionEmployee.getBaseSalary() );

      basePlusCommissionEmployee.setBaseSalary( 1000 ); // set base salary
      
      System.out.printf( "\n%s:\n\n%s\n", 
         "Updated employee information obtained by toString", 
         basePlusCommissionEmployee.toString() );
   } // end main
} // end class BasePlusCommissionEmployeeTest3
