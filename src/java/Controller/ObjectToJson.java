/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Selecciones;
import Model.Selecciones;
import com.google.gson.Gson;
import java.util.ArrayList;

/**
 *
 * @author Aurum CEO
 */
public class ObjectToJson {

    Gson gson;
    private ArrayList<Object> selecciones;

    public ObjectToJson() {
        selecciones = new ArrayList();
    }

    public void creaObjetos(Object o) {
        selecciones.add(o);

    }

    public String convierteObjeto() {
        return new Gson().toJson(getSelecciones());

    }

    public ArrayList<Object> getSelecciones() {
        return selecciones;
    }

    public void setSelecciones(ArrayList<Object> selecciones) {
        this.selecciones = selecciones;
    }

}
