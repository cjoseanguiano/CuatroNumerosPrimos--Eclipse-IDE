/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatronumerosprimos;

/**
 *
 * @author carlosjoseanguiano
 */
public class CuatroNumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int numero;
        int valor;
        int suma = 0;
        int contador = 1;
        int resta = 0;

        Scanner entrada = new Scanner(System.in);
        Scanner valores = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        numero = entrada.nextInt();

        if (numero > 0) {
            do {
                contador++;

                if (contador <= 10) {
                    System.out.println("Numero a comenzar");
                    valor = valores.nextInt();
                    // -----------
                    if (valor < numero) {
                        suma = suma + valor;
                        System.out.println("Menor que numero " + suma);

                    } else if (valor == numero) {

                        System.out.println("Valores iguales " + suma);

                    }
                    if (valor > numero) {
                        System.out.println("Estas sumando un valor mas alto que el numero dado " + (suma = valor - suma));
                        System.out.println("Valores muy alto" + suma);

                    }
                    // -------------
                } else {
                    System.out.println("Perdiste la oportunidad de cuatro numeros");
                    return;
                }

            } while (suma != numero);
            System.out.println("Este es  numero " + numero);

        } else {
            System.out.println("Ingresa un valor mas grande");
        }

    }

}
