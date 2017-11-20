package com.example.cegoc.flor;

/**
 * Contiene la informacion de una carta
 */

public class Carta {

    private final char palo;
    private final int num;
    private final String img;

    /**
     * Constructor con parametros
     * @param palo palo de la baraja
     * @param num numero de la carta
     * @param img nombre del archivo que contiene la imagen
     */
    public Carta(char palo, int num, String img){
        this.palo=palo;
        this.num=num;
        this.img=img;
    }

    public char getPalo() {
        return palo;
    }

    public int getNum() {
        return num;
    }

    public String getImg() {
        return img;
    }
}