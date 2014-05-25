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
public class Videos {

    String idVideo, titulo, img1, img2, url, fecha, comentario;

    public Videos(String id, String ti, String i1, String i2, String u, String fe, String comen) {
        this.idVideo = id;
        this.titulo = ti;
        this.img1 = i1;
        this.img2 = i2;
        this.url = u;
        this.fecha = fe;
        this.comentario = comen;
    }

}
