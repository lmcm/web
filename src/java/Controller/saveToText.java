/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Aurum CEO
 */
public class saveToText {

    public static void guardar(String text) {
        System.out.println("ENTROOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        String nombreArchivo = "C:\\Users\\Aurum CEO\\Documents\\NetBeansProjects\\Web\\src\\nombreArchivo.txt"; // Aqui se le asigna el nombre y 
        FileWriter fw = null;	 // la extension al archivo 
        try {
            fw = new FileWriter(nombreArchivo);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salArch = new PrintWriter(bw);

            salArch.write(text);
            salArch.close();
        } catch (IOException ex) {
        }

    }

}
