/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Aurum CEO
 */
public class Selecciones {

    String id;
    String nombre;
    String continente;
    String bandera;
    String grupo;
    String pj, g, e, p, gf, gc, pts,participaciones,titulos,ranking;

    public Selecciones(String i, String n, String c, String b, String gru, String ss6, String ss7, String ss8, String ss9, String ss10, String ss11, String ss12, String  pa, String ti,String ran) {
        id = i;
        nombre = n;
        continente = c;
        bandera = b;
        grupo = gru;
        pj = ss6;
        g = ss7;
        e = ss8;
        p = ss9;
         gf= ss10;
        gc = ss11;
        pts = ss12;
        participaciones=pa;
        titulos=ti;
        ranking=ran;
        
    }
}
