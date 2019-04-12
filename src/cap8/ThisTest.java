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
public class ThisTest {
    public static void main( String[] args){
        SimpleTime time = new SimpleTime( 15, 30, 19 );
        System.out.println( time.buildString() );
    } // fim de main
} // fim da classe ThisTest

// classe SimpleTime demonstra a referência "this"
class SimpleTime {
    private int hour; // 0 - 23
    private int minute;  // 0 - 59
    private int second; // 0 - 59
    
    // se o construtor utilizar nomes de parâmetro idênticos a nomes de 
    //variáveis de instância, a referência "this" será exigida para distinguir 
    // entre nomes
    public SimpleTime( int hour, int minute, int second ){
        this.hour = hour; // configura a hora do objeto "this"
        this.minute = minute; // configura os minutos do objeto "this"
        this.second = second; // configura os segundos do objeto "this"
    } // fim do construtor SimpleTime
    
    // utilizam "this" explícito e implícito para chamar toUniversalString
    public String buildString(){
        return String.format( "%24s: %s\n%24s: %s", "this.toUniversalString()",
                this.toUniversalString() );
    } // fim do método buildString
    
    // converte em String no formato de data/hora universal (HH:MM:SS)
    public String toUniversalString(){
        // "this" não é requerido aqui para acessar variáveis de instância,
        // porque o método não tem variáveis locais com os mesmos 
        // nomes das variáveis de instância
        return String.format( "%02d:%02d:%02d", this.hour, this.minute, 
                this.second );
    } // fim do método do toUniversalString
} // fim da classe SimpleTime