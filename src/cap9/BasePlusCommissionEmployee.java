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
}
