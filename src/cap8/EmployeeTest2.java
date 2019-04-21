/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap8;

/**
 * Demonstração do membro static.
 * @author SONY VAIO
 */
public class EmployeeTest2 {
    public static void main( String[] args ){
        // mostra que a contagem é 0 antes de criar Employees
        System.out.printf( "Employees before instantiation: %d\n", 
                Employee2.getCount() );
        
        // cria dois Employees; a contagem deve ser 2
        Employee2 e1 = new Employee2( "Susan", "Baker" );
        Employee2 e2 = new Employee2( "Bob", "Blue" );
        
        // mostra que a contagem é 2 depois de criar dois Employees
        System.out.println( "\nEmployees after instantiation: " );
        System.out.printf( "via e1.getCount(): %d\n", e1.getCount() );
        System.out.printf( "via e2.getCount(): %d\n", e2.getCount() );
        System.out.printf( "via Employee2.getCount(): %d\n", 
                Employee2.getCount() );
        
        // obtém nomes de Employees
        System.out.printf( "\nEmployee 1: %s %s\nEmployee 2: %s %s\n\n", 
                e1.getFirstName(), e1.getLastName(), e2.getFirstName(), 
                e2.getLastName() );
        
        // nesse exemplo, há somente uma referência a cada Employee, assim as 
        // duas instruções a seguir fazem com que a JVM marque cada objeto
        // Employee para coleta de lixo
        e1 = null;
        e2 = null;
        
        System.gc(); // pede que a coleta de lixo ocorra agora
        
        // mostra a contagem de Employee depois de chamar o coletor de lixo;
        // contagem exibida pode ser 0, 1 ou 2 com base na execução do coletor
        // de lixo imediata e número de objetos Employees coletados
        System.out.printf( "\nEmployees after System.gc(): %d\n", 
                Employee2.getCount() );
    } // fim de main
} // fim da classe EmployeeTest2
