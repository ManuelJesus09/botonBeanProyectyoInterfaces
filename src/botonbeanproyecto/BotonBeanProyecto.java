/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botonbeanproyecto;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author DAM-2
 */
public class BotonBeanProyecto extends JButton implements Serializable {

    private Color colorFondo, colorBorde;
    private String texto = "Ejemplo";
    private int radio;

    public BotonBeanProyecto() {

        colorFondo = new Color(213, 229, 247);
        colorBorde = Color.blue;
        radio = 6;
        BotonEnCirculo bordeBoton = new BotonEnCirculo(radio);

        setBorder(bordeBoton);
        setBackground(colorFondo);
        setText(this.texto);

    }

    public BotonBeanProyecto(String texto) {

        colorFondo = new Color(213, 229, 247);
        radio = 6;
        BotonEnCirculo bordeBoton = new BotonEnCirculo(radio);
        this.texto = texto;

        setBorder(bordeBoton);
        setBackground(colorFondo);
        setText(this.texto);
    }

    public Color getColorBorde() {
        return colorBorde;
    }

    public void setColorBorde(Color colorBorde) {
        this.colorBorde = colorBorde;
        BotonEnCirculo bordee = new BotonEnCirculo(radio, colorBorde);
        setBorder(bordee);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Color getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo=colorFondo;
        setBackground(colorFondo);
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
