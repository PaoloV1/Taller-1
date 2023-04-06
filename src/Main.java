import edu.princeton.cs.stdlib.StdDraw;
/**
 *
 * Primer taller Programacion Avanzada
 * @author Paolo Vera
 *
 * */



public class Main {
    public static void main(String[] args) {

        double min = -1.0;
        double max = 1.0;

        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);

        StdDraw.enableDoubleBuffering();


        /* Defino las variables de posicion
        * en este caso defino la posicion de la primera linea al azar
        * y las otras 5 lineas las genero en base a la posicion de la linea
        * generada anteriormente restandola por un numero generado al azar divido por 10
        * para que la distancia sea lo necesario para que se distingan pero para que no esten tan separadas
        * */

        //Posicion Primera linea

        double x0 = min + (max - min) * Math.random();
        double y0 = min + (max - min) * Math.random();

        double x1 = min + (max - min) * Math.random();
        double y1 = min + (max - min) * Math.random();

        //Posicion Segunda Linea

        double x2 = x0 - (Math.random() / 10);
        double y2 = y0 - (Math.random() / 10);

        double x3 = x1 - (Math.random() / 10);
        double y3 = y1 - (Math.random() / 10);

        //Posicion Tercera linea

        double x4 = x2 - (Math.random() / 10);
        double y4 = y2 - (Math.random() / 10);

        double x5 = x3 - (Math.random() / 10);
        double y5 = y3 - (Math.random() / 10);

        //Posicion Cuarta linea

        double x6 = x4 - (Math.random() / 10);
        double y6 = y4 - (Math.random() / 10);

        double x7 = x5 - (Math.random() / 10);
        double y7 = y5 - (Math.random() / 10);

        //Posicion Quinta linea

        double x8 = x6 - (Math.random() / 10);
        double y8 = y6 - (Math.random() / 10);

        double x9 = x7 - (Math.random() / 10);
        double y9 = y7 - (Math.random() / 10);

        //Posicion Sexta linea

        double x10 = x8 - (Math.random() / 10);
        double y10 = y8 - (Math.random() / 10);

        double x11 = x9 - (Math.random() / 10);
        double y11 = y9 - (Math.random() / 10);


        /* Defino la velocidad de las lineas
         *  En este caso para que se pudiera apreciar el movimiento de las lineas sin volverse loco el movimiento
         *  dividi el numero al azar que se genera por 100
         */


        //Cree dos valores de movimiento para ambos extremos de las lineas cosa de que sea un movimiento mas dinamico


        double vx = Math.random()/100;
        double vy = Math.random()/100;

        double vx0 = Math.random()/100;
        double vy0 = Math.random()/100;

        while (true) {


            // Colision


            if (Math.abs(x0 + vx0) > 1.0) {
                vx0 = -vx0;
            }
            if (Math.abs(x1 + vx) > 1.0) {
                vx = -vx;
            }

            if (Math.abs(y0 + vy0) > 1.0) {
                vy0 = -vy0;
            }
            if (Math.abs(y1 + vy) > 1.0) {
                vy = -vy;
            }



            // Movimiento de las lineas


                x0 += vx0;
                x1 += vx;
                x2 += vx0;
                x3 += vx;
                x4 += vx0;
                x5 += vx;
                x6 += vx0;
                x7 += vx;
                x8 += vx0;
                x9 += vx;
                x10 += vx0;
                x11 += vx;


                y0 += vy0;
                y1 += vy;
                y2 += vy0;
                y3 += vy;
                y4 += vy0;
                y5 += vy;
                y6 += vy0;
                y7 += vy;
                y8 += vy0;
                y9 += vy;
                y10 += vy0;
                y11 += vy;


                StdDraw.clear();

                //Dibujo de las lineas


                StdDraw.setPenColor(StdDraw.RED);
                StdDraw.line(x0, y0, x1, y1);

                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.line(x2, y2, x3, y3);

                StdDraw.setPenColor(StdDraw.BLUE);
                StdDraw.line(x4, y4, x5, y5);

                StdDraw.setPenColor(StdDraw.GREEN);
                StdDraw.line(x6, y6, x7, y7);

                StdDraw.setPenColor(StdDraw.MAGENTA);
                StdDraw.line(x8, y8, x9, y9);

                StdDraw.setPenColor(StdDraw.GRAY);
                StdDraw.line(x10, y10, x11, y11);


                StdDraw.show();

            }


        }
    }





