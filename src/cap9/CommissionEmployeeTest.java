/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9;

import java.util.Set;

/**
 * Testando a classe CommissionEmployee.
 * @author SONY VAIO
 */
public class CommissionEmployeeTest {
    public static void main( String[] args ){
        // instancia o objeto CommissionEmployee
        CommissionEmployee employee = new CommissionEmployee( "Sue", "Jones", 
                "222-22-2222", 10000, .06 );
        
        // obtém os dados de empregado comissionado
        System.out.println( "Employee information obtained by get "
                + "methods: \n" );
        System.out.printf( "%s %s\n", "First name is ", 
                employee.getFirstName() );
        System.out.printf( "%s %s\n", "Last name is", employee.getLastName() );
        System.out.printf( "%s %s\n", "Social security number is", 
                employee.getSocialSecurityNumber() );
        System.out.printf( "%s %.2f\n", "Gross sales is", 
                employee.getGrossSales() );
        System.out.printf( "%s %.2f\n", "Commission rate is", 
                employee.getCommisionRate());
        
        employee.setGrossSales( 500 ); // configura as vendas brutas
        employee.setCommissionRate( .1 ); // configura a taxa de comissão
        
        System.out.printf( "\n%s:\n\n%s\n", "Update employee information "
                + "obtained by toString", employee );        
    } //fim de main
} // fim da classe CommisionEmployTest
