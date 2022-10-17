package gui;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Jugador
{
    Laberinto celdad = new Laberinto();
    int coordenadasX = 25;
    int coordenadasY = 25;
    int ancho = 35;
    int alto = 25;
    int movimiento = 25;

    public void paint(Graphics graficos)
    {
        graficos.setColor(Color.cyan);
        graficos.fillOval(coordenadasX,coordenadasY,ancho,alto);
        graficos.setColor(Color.black);
        graficos.drawOval(coordenadasX,coordenadasY,ancho,alto);

        //ojos
        graficos.setColor(Color.white);
        graficos.fillOval(coordenadasX+7,coordenadasY+8,13,13);
        graficos.fillOval(coordenadasX+
                21,coordenadasY+8,13,13);
        graficos.setColor(Color.black);
        graficos.fillOval(coordenadasX+
                11,coordenadasY+12,5,5);
        graficos.fillOval(coordenadasX+
                25,coordenadasY+12,5,5);

        //boca
        graficos.setColor(Color.black);
        graficos.fillOval(coordenadasX+7,coordenadasY+24,27,7);
        graficos.fillOval(coordenadasX+
                21,coordenadasY+8,13,13);
        graficos.setColor(Color.black);
        graficos.fillOval(coordenadasX+
                11,coordenadasY+12,5,5);
        graficos.fillOval(coordenadasX+
                25,coordenadasY+12,5,5);
    }

    public void teclado(KeyEvent evento)
    {
        int [][] laberinto= celdad.verLaberinto();

        if(evento.getKeyCode()==37)
        {
            //Izquierda
            if(laberinto[coordenadasY/40][(coordenadasX/40)-1]!=1)
            {
                coordenadasX=coordenadasX-movimiento;
            }
        }

        if(evento.getKeyCode()==39)
        {
            //Derecha
            if(laberinto[coordenadasY/40][(coordenadasX/40)-1]!=1)
            {
                coordenadasX=coordenadasX+movimiento;
            }
        }
        if(evento.getKeyCode()==40)
        {
            //Abajo
            if(laberinto[coordenadasY/40][(coordenadasX/40)-1]!=1)
            {
                coordenadasY=coordenadasY+movimiento;
            }
        }
        if(evento.getKeyCode()==38)
        {
            //Arriba
            if(laberinto[coordenadasY/40][(coordenadasX/40)-1]!=1)
            {
                coordenadasY=coordenadasY-movimiento;
            }
        }

        //si llega al final
        if(coordenadasX==840 && coordenadasY==440)
        {
            Juego.cambioNivel();
            coordenadasX=40;
            coordenadasY=40;
        }
    }

}
