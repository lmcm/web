/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Aurum CEO
 */
public class Noticia {

    public String idNoticia, titulo, img1, img2, fecha, texto;

    public Noticia(String id, String ti, String i1, String i2, String fe, String te) {
        idNoticia = id;
        titulo = ti;
        img1 = i1;
        img2 = i2;
        fecha = fe;
        texto = te;

    }
}
