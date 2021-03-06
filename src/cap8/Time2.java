/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap8;

/**
 * Declaração da classe Time2 com construtores sobrecarregados
 * @author SONY VAIO
 */
public class Time2 {
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59
    
    // construtor sem argumento Time2: inicializa cada variável de instância
    // com zero; assegura que objetos Time2 iniciam em um estado consistente
    public Time2(){
        this(0, 0, 0 ); // invoca o construtor Time2 com três argumentos
    } // fim do construtor sem argumentos Time2
    
    // Construtor Time2: hora fornecida, minuto e segundo padronizados para 0
    public Time2( int h ){
        this( h, 0, 0 ); // invoca o construtor Time2 com três argumentos
    } // fim do construtor de um argumento Time2
    
    // Construtor Time2: hora e minuto fornecidos, segundo padronizado para 0
    public Time2( int h, int m ){
        this( h, m, 0 ); // invoca o construtor Time2 com três argumentos
    } // fim do construtor de dois argumentos Time2
    
    // Construtor Time2: hour, minute e second fornecidos
    public Time2( int h, int m, int s ){
        setTime( h, m, s ); // invoca setTime para validar a data/hora
    } // fim do construtor de três argumentos Time2
    
    // Construtor Time2: outro objeto Time2 fornecido
    public Time2( Time2 time ){
        // invoca o construtor de três argumentos Time2
        this( time.getHour(), time.getMinute(), time.getSecond() );
    } // fim do construtor Time2 com um argumento de objeto Time2
    
    // Métodos set
    // configura um novo valor de data/hora usando UTC; assegura que os dados
    // permaneçam consistentes configurando valores inválidos como zero
    public void setTime( int h, int m, int s ){
        setHour( h ); // configura hour
        setMinute( m ); // configura minute
        setSecond( s ); // configura second
    } // fim do método setTime
    
    // valida e configura a hora
    public void setHour( int h ){
        hour = ( ( h >= 0 && h < 24) ? h : 0 );
    } // fim do método setHour
    
    // valida e configura minutos
    public void setMinute( int m ){
        minute = ( ( m >= 0 && m < 60 ) ? m : 0 );
    } // fim do método setMinute
    
    // valida e configura os segundos
    public void setSecond( int s ){
        second = ( ( s >= 0 && s < 60 ) ? s : 0 );
    } // fim do método setSecond
    
    // Métodos get
    // obtém valor da hora
    public int getHour(){
        return hour;
    } // fim do método getHour
    
    // obtém valor dos minutos
    public int getMinute(){
        return minute;
    } // fim do método getMinute
    
    // obtém o valor dos segundos
    public int getSecond(){
        return second;
    } // fim do método getSecond
    
    // converte em String no formato de data/hora universal (HH:MM:SS)
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), 
                getSecond() );
    } // fim do método do toUniversalString
    
    // converte em String no formato padrão de data/hora (H:MM:SS AM ou PM)
    public String toString(){
        return String.format("%d:%02d:%02d %s", ( ( getHour() == 0 || 
                getHour() == 12 ) ? 12 : getHour() % 12 ), getMinute(), 
                getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
    } // fim do método toString
} // fim da classe Time2
