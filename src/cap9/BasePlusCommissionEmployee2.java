/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9;

/**
 * BasePlusCommissionEmployee2 herda da classe CommissionEmployee.
 * @author Marcio Leandro
 */
public class BasePlusCommissionEmployee2 extends CommissionEmployee2{
    private double baseSalary; // salário-base por semana
    
    // construtor de seis argumentos
    public BasePlusCommissionEmployee2( String first, String last, String ssn, 
            double sales, double rate, double salary ){
            // chamada explícita para o construtor CommissionEmployee 
            // da superclasse
            super( first, last, ssn, sales, rate );
            
            setBaseSalary( amount ); // valida e armazena salário-base
    } // fim do construtor BasePlusCommissionEmployee2 de seis argumentos
    
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
        // não permitido: commissionRate e grossSales private em superclasse
        return baseSalary + ( commissionRate * grossSales );
    } // fim do método earnings
    
    // retorna a representação String de BasePlusCommissionEmployee2
    public String toString(){
        // não permitido: tenta acessar membros private da superclasse
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "base-salaried commission employee", firstName, lastName, 
                "social security number", socialSecurityNumber,
                "gross sales", grossSales, "commission rate", commissionRate, 
                "base salary", baseSalary);
    } // fim do método toString
} // fim da classe BasePlusCommissionEmployee2
