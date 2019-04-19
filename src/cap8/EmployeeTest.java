/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap8;

/**
 * Demonstração de composição.
 * @author SONY VAIO
 */
public class EmployeeTest {
    public static void main( String[] args ){
        Date birth = new Date( 7, 24, 1949 );
        Date hire = new Date( 3, 12, 1988 );
        Employee employee = new Employee( "Bob", "Blue", birth, hire );
        
        System.out.println( employee );
    } // fim de main
} // fim da classe EmployeeTest
