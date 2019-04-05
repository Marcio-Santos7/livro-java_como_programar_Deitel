/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap8;

/**
 *
 * @author SONY VAIO
 */
public class Time1Test {
    public static void main( String[] args ){
      // cria e inicializa um objeto Time1
      Time1 time = new Time1(); // invoca o construtor Time1
      
      // gera saída de representações de string da data/hora
      System.out.print( "The initial universal time is: " );
      System.out.println( time.toUniversalString() );
      System.out.print( "The initial standard time is: " );
      System.out.println( time.toString() );
      System.out.println(); // gera saída de uma linha em branco
      
      // altera a data/hora e gera saída da data/hora atualizada
      time.setTime( 13, 27, 6 );
      System.out.print( "Universal time after setTime is: " );
      System.out.println( time.toUniversalString() );
      System.out.print( "Standard time after setTime is: " );
      System.out.println( time.toString() );
      System.out.println(); // gera saída de uma linha em branco
      
      // configura data/hora com valores inválidos; gera saída da data/hora atualizada
      time.setTime( 99, 99, 99 );
      System.out.println( "After attempting invalid settings:" );
      System.out.print( "Universal time: " );
      System.out.println( time.toUniversalString() );
      System.out.print( "Standard time: " );
      System.out.println( time.toString() );
    } // fim de main
} // fim da classe Time1Test
