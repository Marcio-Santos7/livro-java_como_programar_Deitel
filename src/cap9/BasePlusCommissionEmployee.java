/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9;

/**
 * A classe BasePlusCommissionEmployee representa um empregado que recebe um 
 * salário-base além da comissão.
 * @author SONY VAIO
 */
public class BasePlusCommissionEmployee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales; // vendas brutas semanais 
    private double commissionRate; // porcentagem da comissão
    private double baseSalary; // salário-base por semana
    
    // construtor de seis argumentos
    public BasePlusCommissionEmployee( String first, String last, String ssn,
            double sales, double rate, double salary ){
        // chamada implícita para o construtor Object ocorre aqui
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales( sales ); // valida e armazena as vendas brutas
        setCommissionRate( rate ); // valida e armazena a taxa de comissão
        setBaseSalary( salary ); // valida e armazena o salário-base
    } // fim do construtor BasePlusCommisionEmployee de seis argumentos
    
    // configura o nome
    public void setFirstName( String first ){
        firstName = first;
    } // fim do método setFirstName
    
    // retorna o nome
    public String getFirstName(){
        return firstName;
    } // fim do método getFirstName
    
    // configura o sobrenome
    public void setLastName( String last ){
        lastName = last;
    } // fim do método setLastName
    
    // retorna o sobrenome
    public String getLastName(){
        return lastName;
    } // fim do método getLastName
    
    // configura o SSN (que corresponde ao nosso CPF)
    public void setSocialSecurityNumber( String ssn ){
        socialSecurityNumber = ssn; // deve validar
    } // fim do método setSocialSecurityNumber
    
    // retorna o SSN
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    } // fim do método getSocialSecurityNumber
    
    // configura a quantidadade de vendas brutas
    public void setGrossSales( double sales ){
        grossSales = ( sales < 0.0 ) ? 0.0 : sales;
    } // fim do método setGrossSales
    
    // retorna a quantidade de vendas brutas
    public double getGrossSales(){
        return grossSales;
    } // fim do método getGrossSales
    
    // configura a taxa de comissão 
    public void setCommissionRate( double rate ){
        commissionRate = ( rate > 0.0 && rate <1.0 ) ? rate: 0.0;
    } // fim do método setCommissionRate
    
    // retorna a taxa de comissão
    public double getCommisionRate(){
        return commissionRate;
    } // fim do método getCommission
    
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
    
    // retorna a representação de String de BasePlusCommissionEmployee
    public String toString(){
        return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "base-salaried commission employee", firstName, lastName, 
                "social security number", socialSecurityNumber,
                "gross sales", grossSales, "commission rate", commissionRate,
                "base salary", baseSalary );
    } // fim do método toString    
    } // fim da classe BasePlusCommissionEmployee
