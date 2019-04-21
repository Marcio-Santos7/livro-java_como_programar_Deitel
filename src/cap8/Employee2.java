/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap8;

/**
 * Variável estática utilizada para manter uma contagem do número de objetos
 * Employee2 na memória.
 * @author SONY VAIO
 */
public class Employee2 {
    private String firstName;
    private String lastName;
    private static int count = 0; // número de objetos na memória
    
    // inicializa Employee2, adiciona 1 a static count e gera a saída de 
    // String indicando que o construtor foi chamado
    public Employee2( String first, String last ){
        firstName = first;
        lastName = last;
        
        count++; // incrementa contagem estática de empregados
        System.out.printf( "Employee2 construtor: %s %s; count = %d\n", 
                firstName, lastName, count );
    }  // fim do construtor Emloyee2
    
    // subtrai 1 de static count quando o coletor de lixo
    // chama finalize para limpar o objeto;
    // confirma se finalize foi chamado
    protected void finalize(){
        count--; // decrementa contagem estática de empregados
        System.out.printf("Employee2 finalizer: %s %s; count = %d\n", 
                firstName, lastName, count );
    } // fim do método finalize
    
    // obtém o primeiro nome
    public String getFirstName(){
        return firstName;
    } // fim do método getFirstName
    
    // obtém o último nome
    public String getLastName(){
        return lastName;
    } //fim do método getLastName
    
    // método estático obter valor de contagem estática
    public static int getCount(){
      return count;
    } // fim do método getCount
} // fim da classe Employee2
