import gui.Juego;
import gui.Jugador;
import gui.Laberinto;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends JPanel
{
    Laberinto laberinto=new Laberinto();
    Jugador jugador = new Jugador();
    public static int nivel = 1;

    public void Juego()
    {
        addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e)
            {
            }

            @Override
            public void keyPressed(KeyEvent e)
            {
                jugador.teclado(e);
            }

            @Override
            public void keyReleased(KeyEvent e)
            {
            }
        });
            setFocusable(true);
        }

        public void paint(Graphics graficos)
        {
            laberinto.paint(graficos);
            jugador.paint(graficos);
        }

        public static int cambioNivel()
        {
            return nivel++;
        }

        public static int obtenerNivel()
        {
            return nivel;
        }

    public static void Main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Comencemos");
        JFrame vetana = new JFrame("Wilde Maze");
        Juego game = new Juego();
        Ventana.add(game);
        Ventana.setSize(900,500);
        Ventana.setLocation(300,200);
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperatio(JFrame.EXIT_ON_CLOSE);

        while (true)
        {
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(Juego.class.getName().log(Level.SEVERE));
            }
            game.repaint();
            if(obtenerNivel()<3)
            {
                JOptionPane.showMessageDialog(null,"Se acabó");
                System.exit(0);
            }
        }

    }
}
