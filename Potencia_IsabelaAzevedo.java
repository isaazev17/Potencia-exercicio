/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia_isabelaazevedo;
import java.util.Scanner;

/**
 *
 * @author Isabela
 */
public class Potencia_IsabelaAzevedo {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) 
    {
       Scanner leitor = new Scanner(System.in);
       System.out.print("Digite um n�mero:");
       int numero = leitor.nextInt();
       int potencia;
        System.out.print("A potencia de 0 � 15 �:");
       for (int i=0; i<=15;i++)
       {potencia = (int) Math.pow(numero,i);
       System.out.println(numero + "*"+i+"="+potencia);
       
       }}
      }


    

