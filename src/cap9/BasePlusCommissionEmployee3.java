/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9;

/**
 * BasePlusCommissionEmployee3 herda de CommissionEmployee2 e tem acesso a
 * membros protected de CommissionEmployee2.
 * @author Marcio Leandro
 */
public class BasePlusCommissionEmployee3 extends CommissionEmployee2 {
    private double baseSalary; // salário-base por semana
    
    // construtor de seis argumentos
    public BasePlusCommissionEmployee3( String first, String last, String ssn,
            double sales, double rate, double salary ){
        super( first, last, ssn, sales, rate );
        setBaseSalary( salary ); // valida e armazena salário-base
} // fim do construtor BasePlusCommissionEmployee3 de seis argumentos
    
    // configura o salário-base
    public void setBaseSalary( double salary ){
        baseSalary = ( salary < 0.0 ) ? 0.0 : salary;
    } // fim do método setBaseSalary
    
    // retorna o salário-base
    public double getBaseSalary(){
        return baseSalary;
    } // fim do método getBaseSalary
    
    // calcula os lucros
    public double earnings(){
        return baseSalary + ( commissionRate * grossSales );
    } // fim do método earnings
    
    // retorna a representação String de BasePlusCommissionEmployee3
    public String toString(){
        return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "base-salaried commission employee", firstName, lastName,
                "social security number", socialSecurityNumber, 
                "gross sales", grossSales, "commission rate", commissionRate,
                "base salary", baseSalary );
    } // fim do método toString
} // fim da classe BasePlusCommissionEmployee3

