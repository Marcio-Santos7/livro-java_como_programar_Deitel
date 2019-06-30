/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9;

/**
 * Testando a classe BasePlusCommissionEmployee
 * @author Marcio Leandro
 */
public class BasePlusCommissionEmployeeTest {
    public static void main( String[] args ){
        // instancia o objeto BasePlusCommissionEmployee
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
        "Bob", "Lewis", "333-33-333", 5000, .04, 300 );
        
        // obtém os dados do empregado comissionado com salário-base
        System.out.println( 
                "Employee information obtained by get methods: \n" );
        System.out.printf( 
                "%s %s\n","First name is", employee.getFirstName());
        System.out.printf( 
                "%s %s\n","Last name is", employee.getLastName());
        System.out.printf( "%s %s\n", "Social security number is", 
                employee.getSocialSecurityNumber() );
        System.out.printf( 
                "%s %.2f\n", "Gross sales is", employee.getGrossSales());
        System.out.printf( "%s %.2f\n", "Commission rate is", 
                employee.getCommisionRate() );
        System.out.printf( "%s %.2f\n", "Base salary is", 
                employee.getBaseSalary() );
        
        employee.setBaseSalary( 1000 ); // configura o salário-base
        
        System.out.printf("\n%s:\n\n%s\n", 
                "Update employee information obtained by toString", 
                employee.toString() );
    } // fim de main
} // fim da classe BasePlusCommissionEmployeeTest
