package com.bcopstein;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("\nResultados da Mega Sena:");
        String[] resultado = ResultadoMegasena.obtemUltimoResultado();
        for (String dezena: resultado) {
              System.out.print(dezena + " ");
        }
        System.out.println("\n");
    }
}
