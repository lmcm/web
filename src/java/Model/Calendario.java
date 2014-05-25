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
public class Calendario {

    public String idCalendario, idHorario, fecha, estadio, seleccion1, seleccion2, ciudad, bandera, bandera2, grupo1, grupo2, golLocal, golVisita;

    public Calendario(String id, String ho, String fe, String es, String se1, String se2, String ci, String bandera, String bandera2, String grupo1, String grupo2, String g1, String g2) {

        this.idCalendario = id;
        this.idHorario = ho;
        this.fecha = fe;
        this.estadio = es;
        this.seleccion1 = se1;
        this.seleccion2 = se2;
        this.ciudad = ci;
        this.bandera = bandera;
        this.bandera2 = bandera2;
        this.grupo1 = grupo1;
        this.grupo2 = grupo2;
        this.golLocal = g1;
        this.golVisita = g2;
    }

}
