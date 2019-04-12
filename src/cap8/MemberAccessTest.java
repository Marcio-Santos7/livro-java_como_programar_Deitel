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
public class MemberAccessTest {
    public static void main( String[] args ){
        Time1 time = new Time1(); // cria e inicializa o objeto Time1
        
        time.hour = 7; // erro: hour tem acesso privado em Time1
        time.minute = 15; // erro: minute tem acesso privado em Time1
        time.second = 30; // erro: second tem acesso privado em Time1
    
    } // fim de main
} // fim da classe MemberAccessTest
