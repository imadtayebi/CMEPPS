/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahoracado;

import java.util.ArrayList;
import java.util.Scanner;
import static javax.management.Query.lt;

/**
 *
 * @author USUARIO
 */
public class Jugador {

    int vidas;
    int Victorias;
    int id;

    Jugador(int id) {
        this.id=id;
        this.Victorias=0;
        vidas = 6;
    }
    public int getVictorias(){return Victorias;}
    public void setVidas(int v){vidas=v;}

    public void Jugar() {
        System.out.println("El jugador no activo debe introducir la palabra a adivinar: ");
        Scanner sc0 = new Scanner(System.in);
        String Solucion = sc0.nextLine();
        String Intento;
        int c=Solucion.length();
        char[] Int= new char [c];
        for (int i = 0; i < (Solucion.length() - 1); i++) {
            Int[i] = '_';
        }
        Intento = String.valueOf(Int);
        Scanner sc = new Scanner(System.in);
        boolean acierto = false;
        char[] in = new char[Solucion.length()];
        while (!Intento.toLowerCase().equals(Solucion.toLowerCase()) && vidas > 0) {
            this.limpiar();
            this.dibujar(vidas);
            System.out.println(Intento);
            if (vidas != 0) {
                System.out.println("\nIntroduzca una letra: ");
                String letra = sc.nextLine();
                for (int i = 0; i < Solucion.length(); i++) {
                    if (Solucion.toLowerCase().charAt(i) == letra.toLowerCase().charAt(0)) {
                        in[i] = letra.charAt(0);
                        acierto = true;
                    }
                }
                Intento = String.valueOf(in);
                if (acierto == false) {
                    vidas--;
                    if(vidas==0){
                        this.dibujar(0);
                        System.out.println("\nLo siento, la respuesta era"+ Solucion);
                    }
                }
                if(Intento.toLowerCase().equals(Solucion.toLowerCase())){
                    System.out.println("\n ACERTASTE, la respuesta es: "+Intento);
                    Victorias++;
                }
                
                acierto = false;
            }
        }

    }

    private void limpiar() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    private void dibujar(int i) {
        switch (i) {
            case 6:
                System.out.println(" ---------------------");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("__________");
                break;

            case 5:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("__________");
                break;

            case 4:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("__________");
                break;

            case 3:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / |   ");
                System.out.println(" |                 /   |   ");
                System.out.println(" |                /    |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("__________");
                break;

            case 2:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |    \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("__________");
                break;

            case 1:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    /  ");
                System.out.println(" |                   /      ");
                System.out.println(" |                  /       ");
                System.out.println(" |");
                System.out.println("__________");
                break;

            case 0:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | X  X  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    / \\");
                System.out.println(" |                   /   \\  ");
                System.out.println(" |                  /     \\ ");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("__________");
                System.out.println("GAME OVER");
                break;
        }
    }
}
