package com.example.cegoc.flor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Contiene la informacion de un mazo de 40 cartas de la baraja española
 */

public class Baraja {

    private final Carta[] mazoBase= new Carta[40];
    private Stack<Carta> mazo=new Stack<Carta>();

    public Baraja(){
        // Se crea la baraja
            // Espadas
        mazoBase[0]=new Carta('e', 1, "espada1");
        mazoBase[1]=new Carta('e', 2, "espada2");
        mazoBase[2]=new Carta('e', 3, "espada3");
        mazoBase[3]=new Carta('e', 4, "espada4");
        mazoBase[4]=new Carta('e', 5, "espada5");
        mazoBase[5]=new Carta('e', 6, "espada6");
        mazoBase[6]=new Carta('e', 7, "espada7");
        mazoBase[7]=new Carta('e', 10, "espada10");
        mazoBase[8]=new Carta('e', 11, "espada11");
        mazoBase[9]=new Carta('e', 12, "espada12");
            // Bastos
        mazoBase[10]=new Carta('b', 1, "basto1");
        mazoBase[11]=new Carta('b', 2, "basto2");
        mazoBase[12]=new Carta('b', 3, "basto3");
        mazoBase[13]=new Carta('b', 4, "basto4");
        mazoBase[14]=new Carta('b', 5, "basto5");
        mazoBase[15]=new Carta('b', 6, "basto6");
        mazoBase[16]=new Carta('b', 7, "basto7");
        mazoBase[17]=new Carta('b', 10, "basto10");
        mazoBase[18]=new Carta('b', 11, "basto11");
        mazoBase[19]=new Carta('b', 12, "basto12");
            // Oros
        mazoBase[20]=new Carta('o', 1, "oro1");
        mazoBase[21]=new Carta('o', 2, "oro2");
        mazoBase[22]=new Carta('o', 3, "oro3");
        mazoBase[23]=new Carta('o', 4, "oro4");
        mazoBase[24]=new Carta('o', 5, "oro5");
        mazoBase[25]=new Carta('o', 6, "oro6");
        mazoBase[26]=new Carta('o', 7, "oro7");
        mazoBase[27]=new Carta('o', 10, "oro10");
        mazoBase[28]=new Carta('o', 11, "oro11");
        mazoBase[29]=new Carta('o', 12, "oro12");
            // Copas
        mazoBase[30]=new Carta('c', 1, "copa1");
        mazoBase[31]=new Carta('c', 2, "copa2");
        mazoBase[32]=new Carta('c', 3, "copa3");
        mazoBase[33]=new Carta('c', 4, "copa4");
        mazoBase[34]=new Carta('c', 5, "copa5");
        mazoBase[35]=new Carta('c', 6, "copa6");
        mazoBase[36]=new Carta('c', 7, "copa7");
        mazoBase[37]=new Carta('c', 10, "copa10");
        mazoBase[38]=new Carta('c', 11, "copa11");
        mazoBase[39]=new Carta('c', 12, "copa12");

        barajar();
    }

    public Stack<Carta> getMazo(){
        return mazo;
    }

    /**
     * Metodo que sirve para desordenar el array (reset)
     */
    public void barajar(){
        // Desordena el array y lo convierte a pila
        List<Carta> aux = Arrays.asList(mazoBase);
        Collections.shuffle(aux);
        this.mazo.addAll(aux);
    }

    /**
     * Metodo que reparte el numero de cartas que se le indica
     * @param num numero de cartas que se van a repartir
     * @return aux ArrayList con las cartas repartidas
     */
    public ArrayList<Carta> repartir(int num){
        ArrayList<Carta> aux=new ArrayList<Carta>();
        for (int i=0; i<num; i++){
            aux.add(this.mazo.pop());
        }
        return aux;
    }

    /**
     * Roba una carta, si no hay mas retorna null
     * @return carta robada
     */
    public Carta robar(){
        return this.mazo.pop();
    }
}
