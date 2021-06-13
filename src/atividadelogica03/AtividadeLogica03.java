/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadelogica03;

/**
 *
 * @author odavi
 */
public class AtividadeLogica03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int num, soma, cont;
        cont = 10; num = 3; soma = 0;
        
        while(cont <=10 && cont >=3){
            soma = num + cont;
            System.out.println("Número: "+num);
            System.out.println("Contador "+cont);
            System.out.println("Soma: "+soma);
            num++;
            cont--;
        }
    }
    
}
