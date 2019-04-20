/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap8;

/**
 * Declarando um tipo enum com um construtor e campos de instância explícitos
 * e métodos de acesso para esses campos
 * @author SONY VAIO
 */
public enum Book {
    // declara constantes do tipo enum
    JHTP6( "Java How to Program 6e", "2005" ),
    CHTP4( "C How to Program 4e", "2004" ),
    IW3HTP3( "Internet & World Wide Web How to Program 3e", "2004" ),
    CPPHTP4( "C++ How to Program 4e", "2003" ),
    VBHTP2("Visual Basic .NET How to Program 2e", "2002" ),
    CSHARPHTP( "C# How to Program", "2002" );
    
    // campos de instância
    private final String title; // título do livro
    private final String copyrightYear; // ano dos direitos autorais
    
    // construtor enum
    Book( String bookTitle, String year ){
        title = bookTitle;
        copyrightYear = year;
    } // fim do construtor enum Book
    
    // método de acesso para campo de título
    public String getTitle(){
        return title;
    } // fim do método getTitle
    
    // método de acesso para o campo copyrightYear
    public String getCopyrightYear(){
        return copyrightYear;
    } // fim do método getCopyrightYear
} // fim do enum Book
