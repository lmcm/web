/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.HashMap;

/**
 *
 * @author Aurum CEO
 */
public class QueryArray {

    private HashMap<String, String> querys = new HashMap<>();

    public HashMap<String, String> getQuerys() {
        return querys;
    }

    public void setQuerys(HashMap<String, String> querys) {
        this.querys = querys;
    }

    public QueryArray() {
        querys.put("selecciones", "SELECT s.idSeleccion, s.nombreIng, s.continenteIng, s.bandera, t.nombre, s.PJ, s.PG, s.PP, s.PE, s.GF, s.GC, s.Pts, s.participaciones, s.titulos, s.ranking FROM seleccion s, grupo g, TipoGrupo t  WHERE s.idSeleccion = g.idSeleccion AND g.idTipoGrupo = t.idTipoGrupo ORDER BY  t.nombre ASC");
        querys.put("selecciones2", "SELECT s.idSeleccion, s.nombreEs, s.continenteEs, s.bandera, t.nombre, s.PJ, s.PG, s.PP, s.PE, s.GF, s.GC, s.Pts,s.participaciones, s.titulos, s.ranking FROM seleccion s, grupo g, TipoGrupo t WHERE s.idSeleccion = g.idSeleccion AND g.idTipoGrupo = t.idTipoGrupo ORDER BY  t.nombre ASC");
        querys.put("ciudades", "SELECT * from ciudades where idIdioma=");
    }

}
