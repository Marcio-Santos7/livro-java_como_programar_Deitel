/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9;

/**
 * Classe CommissionEmployee2 representa um empregado comissionado.
 * @author Marcio Leandro
 */
public class CommissionEmployee2 {
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;
    protected double grossSales; // vendas brutas semanais
    protected double commissionRate; // porcentagem da comissão
    
    // construtor de cinco argumentos
    public CommissionEmployee2( String first, String last, String ssn, 
            double sales, double rate ){
        // chamada implícita para o construtor Object ocorre aqui
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales( sales ); // valida e armazena as vendas brutas
        setCommissionRate( rate ); // valida e armazena a taxa de comissão
    } // fim do constutor CommissionEmployee d cinco argumentos
    
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
    } // fim do método getSecuritySocialNumber
    
    // configura a quantidade de vendas brutas
    public void setGrossSales( double sales ){
        grossSales = (sales < 0.0 ) ? 0.0 : sales;
    } // fim do método setGrossSales
    
    // retorna a quantidade de vendas brutas
    public double getGrossSales(){
        return grossSales;
    } // fim do método getGrossSales
    
    // configura a taxa de comissão
    public void setCommissionRate( double rate ){
        commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 00;
    } // fim do método setCommissionRate
    
    // retorna a taxa de comissão 
    public double getCommissionRate(){
       return commissionRate;
    } // fim do método getCommisionRate
    
    // calcula os lucros
    public String toString(){
        return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "commissionemployee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales,
                "commission rate", commissionRate );
    } // fim do método toString 
} // fim da classe CommissionEmployee2