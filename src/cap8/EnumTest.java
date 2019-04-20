/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap8;

import java.util.EnumSet;

/**
 * Testando o tipo enum Book.
 * @author SONY VAIO
 */
public class EnumTest {
    public static void main( String[] args ){
        System.out.println( "All books:\n" );
        
        // imprime todos os livros em enum Book
        for( Book book : Book.values() )
            System.out.printf( "%-10s%-45s%s\n", book, book.getTitle(), 
                    book.getCopyrightYear() );
        
        System.out.println( "\nDisplay a range of enum constants:\n" );
        
        // imprime os primeiros quatro livros
        for( Book book : EnumSet.range( Book.JHTP6, Book.CPPHTP4) )
            System.out.printf( "%-10s%-45s%s\n", book, book.getTitle(),
                    book.getCopyrightYear() );
    } // fim de main
} // fim da classe EnumTest
