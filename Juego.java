/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahoracado;

/**
 *
 * @author USUARIO
 */
public class Juego {

    Jugador jug1;
    Jugador jug2;


    public void Partida() {
        Jugador jug1 = new Jugador(1);
        Jugador jug2 = new Jugador(2);
        int i = 0;
        while (i < 5 && ((jug1.getVictorias() < 3) && (jug2.getVictorias() < 3))) {
            System.out.println("\n Turno del jugador 1");
            jug1.setVidas(6);
            jug1.Jugar();
            System.out.println("\n Turno del jugador 2");
            jug2.setVidas(6);
            jug2.Jugar();
        }
        if (jug1.getVictorias() > jug2.getVictorias()) {
            System.out.println("\n Gana el Jugador 1");
        } else {
            System.out.println("\n Gana el Jugador 2");
        }
    }
}
