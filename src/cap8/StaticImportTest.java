/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap8;

/**
 * Utilizando import static para importar métodos static da classe Math.
 * @author SONY VAIO
 */
import static java.lang.Math.*;
        
public class StaticImportTest {
    public static void main( String[] args ){
        System.out.printf( "sqrt( 900.0 ) = %.1f\n", sqrt(900.0 ) );
        System.out.printf( "ceil( -9.8 ) = %.1f\n", ceil( -9.8 ) );
        System.out.printf( "log( E ) = %.1f\n", log( E ) );
        System.out.printf( "cos( 0.0 ) = %.1f\n", cos( 0.0 ) );
    } // fim de main
} // fim da classe StaticImportTest
