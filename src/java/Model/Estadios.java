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
public class Estadios {

    String id, nombre, año, capacidad, img1, img2, descripcion, ciudad;

    public Estadios(String i, String nom, String a, String cap, String i1, String i2, String des, String c) {
        id = i;
        nombre = nom;
        año = a;
        capacidad = cap;
        img1 = i1;
        img2 = i2;
        descripcion = des;
        ciudad = c;

    }

}
