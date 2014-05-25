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
public class Imagenes {

    public String idFoto, idioma, titulo, img1, img2, fecha, comentario;

    public Imagenes(String id, String ti, String i1, String i2, String fe, String com) {
        this.idFoto = id;
        
        this.titulo = ti;
        this.img1 = i1;
        this.img2 = i2;
        this.fecha = fe;
        this.comentario = com;

    }
}
