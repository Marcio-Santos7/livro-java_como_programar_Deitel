/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap8;

/**
 * Declaração da classe Date.
 * @author SONY VAIO
 */
public class Date {
    private int month; // 1 - 12
    private int day; // 1 - 31 conforme o mês
    private int year; // qualquer ano
    
    // construtor: chama checkMonth para confirmar o valor adequado para month;
    // chama checkDay para confirmar o valor adequado para day
    public Date( int theMonth, int theDay, int theYear ){
        month = checkMonth( theMonth ); // valida month
        year = theYear; // poderia validar year
        day = checkDay( theDay ); // valida day
        
        System.out.printf("Date object construtor for date %s\n", this );
    } // fim do construtor Date
    
    // método utilitário para confirmar o valor adequado de month
    private int checkMonth( int testMonth ){
        if( testMonth > 0 && testMonth <= 12 ) // valida month
            return testMonth;
        else // month é inválido
        {    System.out.printf( "Invalid month (%d) set to 1.", testMonth );
                return 1; // mantém objeto em estado consistente 
        }  // fim de else
    } // fim do método checkMonth
    
    // método utilitário para confirmar o valor adequado de day com base 
    // em month e year
    private int checkDay( int testDay ){
        int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 
            30, 31, 30, 31 };
        
        // verifica se day está no intervalo para month
        if( testDay > 0 && testDay <= daysPerMonth[ month ] )
            return testDay;
        
        // verifica ano bissexto
        if( month == 2 && testDay == 29 && ( year % 400 == 0 || 
                ( year % 4 == 0 && year % 100 != 0 ) ) )
            return testDay;
        
        System.out.printf( "Invalid day (%d) set to 1.", testDay );
        return 1; // mantém objeto em estado consistente
    } // fim do método checkDay
    
    // retorna uma String no formato mês/dia/ano
    public String toString(){
        return String.format( "%d/%d/%d", month, day, year );
    } // fim do método toString
} // fim da classe Date
