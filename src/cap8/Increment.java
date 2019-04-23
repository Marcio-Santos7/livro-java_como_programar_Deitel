/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap8;

/**
 * Variável de instância final em uma classe.
 * @author SONY VAIO
 */
public class Increment {
    private int total = 0; // total de todos os incrementos
    private final int INCREMENT; // variável constante (não-inicializada)
    
    // construtor inicializa variável de instância final INCREMENT
    public Increment( int incrementValue ){
        INCREMENT = incrementValue; // inicializa variável constante (uma vez)
    } // fim do construtor Increment
    
    // adiciona INCREMENT ao total
    public void addIncrementToTotal(){
        total += INCREMENT;
    } // fim do método addIncrementToTotal
    
    // retorna representação de String dos dados de um objeto Increment
    public String toString(){
        return String.format( "total = %d", total );
    } // fim do método toIncrementString
} // fim da classe Increment
