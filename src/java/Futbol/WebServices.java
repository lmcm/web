/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Futbol;

import Model.Calendario;
import Controller.ObjectToJson;
import Controller.QueryArray;
import Controller.saveToText;
import Model.Ciudades;
import Model.Estadios;
import Model.Imagenes;
import Model.Model;
import Model.Noticia;
import Model.Selecciones;
import Model.Videos;
import Model.Galeria;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author Aurum CEO
 */
@Path("/mundial2014")
public class WebServices {

    @Context
    private UriInfo context;

    public WebServices() {

    }

    @GET
    @Produces("text/plain")
    @Path("/selecciones/{idioma}")
    public String getSelecciones(@PathParam("idioma") int idioma) {
        Model m = new Model(idioma, "selecciones");
        ObjectToJson cast = new ObjectToJson();
        ResultSet rs = m.query();
        try {
            while (rs.next()) {
                cast.creaObjetos(new Selecciones(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11),
                        rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        String JsonString = cast.convierteObjeto();
//        saveToText.guardar(JsonString);
        m.cerrarConexion();
        return (JsonString);
    }

    @GET
    @Produces("text/plain")
    @Path("/ciudades/{idioma}")
    public String getCiudades(@PathParam("idioma") int idioma) throws UnsupportedEncodingException {
        Model m = new Model(idioma, "ciudades");
        ObjectToJson cast = new ObjectToJson();
        ResultSet rs = m.query();
        try {
            while (rs.next()) {
                cast.creaObjetos(new Ciudades(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
                System.out.println(rs.getString(1) + rs.getString(2) + rs.getString(3) + rs.getString(4) + rs.getString(5));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        String JsonString = cast.convierteObjeto();
//        String s = JsonString.replaceAll("u+0027", "'");
//        String ss = s.replaceAll("(\\\\n)", " ");
//        String sss = ss.replaceAll("(\\\\)", "");
//      

//        saveToText.guardar(JsonString);
        m.cerrarConexion();
        System.out.println(JsonString);

        return (JsonString);
    }

    @GET
    @Produces("text/plain")
    @Path("/estadios/{idioma}")
    public String getEstadios(@PathParam("idioma") int idioma) throws UnsupportedEncodingException {
        Model m = new Model(idioma, "estadios");
        ObjectToJson cast = new ObjectToJson();
        ResultSet rs = m.query();
        try {
            while (rs.next()) {
                cast.creaObjetos(new Estadios(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
                System.out.println(rs.getString(1) + rs.getString(2) + rs.getString(3) + rs.getString(4) + rs.getString(5) + rs.getString(6) + rs.getString(7) + rs.getString(8));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        String JsonString = cast.convierteObjeto();
//        String s = JsonString.replaceAll("u+0027", "'");
//        String ss = s.replaceAll("(\\\\n)", " ");
//        String sss = ss.replaceAll("(\\\\)", "");

//        
//        saveToText.guardar(JsonString);
        m.cerrarConexion();

        return (JsonString);
    }

    @GET
    @Produces("text/plain")
    @Path("/noticias/{idioma}")
    public String getNoticias(@PathParam("idioma") int idioma) {
        Model m = new Model(idioma, "noticias");
        ObjectToJson cast = new ObjectToJson();
        ResultSet rs = m.query();
        try {
            while (rs.next()) {
                cast.creaObjetos(new Noticia(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        String JsonString = cast.convierteObjeto();
//        saveToText.guardar(JsonString);
        m.cerrarConexion();
        return (JsonString);
    }

    @GET
    @Produces("text/plain")
    @Path("/imagenes/{idioma}")
    public String getImagenes(@PathParam("idioma") int idioma) {
        Model m = new Model(idioma, "imagenes");
        ObjectToJson cast = new ObjectToJson();
        ResultSet rs = m.query();
        try {

            while (rs.next()) {

                cast.creaObjetos(new Imagenes(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        String JsonString = cast.convierteObjeto();
        m.cerrarConexion();
        return (JsonString);
    }

    @GET
    @Produces("text/plain")
    @Path("/videos/{idioma}")
    public String getVideos(@PathParam("idioma") int idioma) {
        Model m = new Model(idioma, "videos");
        ObjectToJson cast = new ObjectToJson();
        ResultSet rs = m.query();
        try {
            while (rs.next()) {
                System.out.println("ENTRO AL WHILE");
                cast.creaObjetos(new Videos(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        String JsonString = cast.convierteObjeto();
        m.cerrarConexion();
        return (JsonString);
    }

    @GET
    @Produces("text/plain")
    @Path("/galeria/{idioma}")
    public String getGaleria(@PathParam("idioma") int idioma) {
        Model m = new Model(idioma, "galeria");
        ObjectToJson cast = new ObjectToJson();
        ResultSet rs = m.query();
        try {
            while (rs.next()) {

                cast.creaObjetos(new Galeria(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        String JsonString = cast.convierteObjeto();
        m.cerrarConexion();
        return (JsonString);
    }

    @GET
    @Produces("text/plain")
    @Path("/calendario/{idioma}")
    public String getCalendario(@PathParam("idioma") int idioma) {
//        JOptionPane.showMessageDialog("")
        System.out.println("ENTRO A CALENDARIO");
        Model m = new Model(idioma, "calendario");
        ObjectToJson cast = new ObjectToJson();
        ResultSet rs = m.query();
        int c = 0;
        String seleccion2 = null;
        String bandera2 = null;
        String grupo1 = null, grupo2;
        try {
            while (rs.next()) {

                if (c % 2 == 0) {
                    seleccion2 = rs.getString(5);
                    bandera2 = rs.getString(7);
                    grupo1 = this.getGrupo(rs.getString(8));

                } else {
                    grupo2 = this.getGrupo(rs.getString(8));

                    cast.creaObjetos(new Calendario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), seleccion2, rs.getString(5), rs.getString(6), bandera2, rs.getString(7), grupo1, grupo2, rs.getString(9), rs.getString(10)));
                    seleccion2 = "";
                }
                c++;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        String JsonString = cast.convierteObjeto();
        m.cerrarConexion();
        return (JsonString);
    }

    @PUT
    @Consumes("text/plain")
    public void putText(String content) {
    }

    public String getGrupo(String g) {
        switch (g) {
            case "1":
                g = "A";
                break;
            case "2":
                g = "B";
                break;
            case "3":
                g = "C";
                break;
            case "4":
                g = "D";
                break;
            case "5":
                g = "E";
                break;
            case "6":
                g = "F";
                break;
            case "7":
                g = "G";
                break;
            case "8":
                g = "H";
                break;

        }
        return g;
    }
}
