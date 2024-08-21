package com.cibancode.figuras.ejemplo1;

import java.util.Vector;
import java.util.Enumeration;

public class Figuras {
    private Vector<Figura> figuras = new Vector<>();

    public void addFigura(Figura f) {
        figuras.add(f);
    }

    public void dibujarFiguras() {
        Enumeration<Figura> elems = figuras.elements();
        while (elems.hasMoreElements()) {
            Figura f = elems.nextElement();
            f.dibujar();
        }
    }
}