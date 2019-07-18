/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9;

/**
 * Classe BasePlusCommissionEmployee4 herda de CommissionEmployee3 e acessa os
 * dados privados de CommissionEmployee3 via os métodos public de 
 * CommissionEmployee3.
 * @author Marcio Leandro 
 */
public class BasePlusCommissionEmployee4 extends CommissionEmployee3{
    private double baseSalary; // salário-base por semana 
    
    // construtor de seis argumentos
    public BasePlusCommissionEmployee4( String first, String last, String ssn,
            double sales, double rate, double salary ){
        super( first, last, ssn, sales, rate );
        setBaseSalary( salary ); // valida e armazena salário-base
    } // fim do construtor BasePlusCommissionEmployee4 de seis argumentos
    
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
        return getBaseSalary() + super.earnings();
    } // fim do método earnings
    
    // retorna a representação String de BasePlusCommissionEmployee4
    public String toString(){
        return String.format( "%s %s\n%s: %.2f", "base-salaried", 
                super.toString(), "base salary", getBaseSalary());
    } // fim do método toString
} // fim da classe BasePlusCommissionEmployee4
