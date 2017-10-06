/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sello_de_tiempo;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

public class Insertar_imagen_y_letras {

    public static void main(String[] args) throws DocumentException, MalformedURLException, IOException {
        Document document = new Document();

        //Se da la ruta del archivo 
        PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\SOFTWARE2\\Desktop\\ETB.pdf"));
        document.open();
        try {
            //se loe ingresa la ruta de la imgen para insrtar
            Image img = Image.getInstance("C:\\Users\\SOFTWARE2\\Pictures\\lexco.png");
            //se le adiciona las palabras que desea ingresar al documento     
            document.add(new Paragraph("Sample 1: This is simple image demo y hice refactor y rename del proyecto."));
            //opcional si quiere cambiar la posicion de la imagen
            img.setAbsolutePosition(250, 700);
            //se adiciona al documento la imagen 
            document.add(img);
            document.close();
        } catch (DocumentException | IOException e) {
            System.err.println("Error" + e.getMessage());
        }

    }
}
