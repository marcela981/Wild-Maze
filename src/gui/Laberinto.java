package gui;

import java.awt.*;

public class Laberinto
{
    int[][] celdas = new int[10][20];
    int fila = 0;
    int columna = 0;
    int numeroFilas = 10;
    int numeroColumnas = 20;
    int anchoBloque = 25;
    int altoBloque = 25;

    public int[][] paint (Graphics graficos)
    {
        return new int[0][];
    }

    public int [][] verLaberinto()
    {
        if(Juego.obtenerNivel()==1)
        {
            celdas = Laberinto;
        }

        if(Juego.obtenerNivel()==2)
        {
            celdas = Laberinto;
        }

        if(Juego.obtenerNivel()==3)
        {
            celdas = Laberinto;
        }

    }

        return celdas;
    }

}
