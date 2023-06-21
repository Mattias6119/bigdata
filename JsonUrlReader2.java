/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.beam.examples;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.beam.examples.Aire;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author leo
 */
public class JsonUrlReader2 {

    public JsonUrlReader2()
    {
        
    }
      
    public ArrayList<Aire> cargarURL() throws StreamReadException, DatabindException, MalformedURLException, IOException {
        String url = "https://mindicador.cl/api";
        
        ArrayList<Aire> aAire = new ArrayList();

        //JsonNode node = new JsonUrlReader().get(url);
        //System.out.println(node.toPrettyString());
        
        
        ObjectMapper mapper = new ObjectMapper();

	System.out.println("Inicando mapper en JsonUrlReader");
        JsonNode node = mapper.readTree(new URL(url));

        System.out.println("Finalizando mapper en JsonUrlReader");
        
        
        Iterator<JsonNode> it = node.iterator();
        
        Aire a = null;
        a = new Aire();
        a.setCodigo("CODIGO");
        a.setNombre("NOMBRE");
        a.setUnidadmedida("UNIDADMEDIDA");
        a.setFecha("REALTIME");
        a.setValor("VALOR");
        

        a.setTasadesCodigo("CODIGO");
        a.setTasadesNombre("NOMBRE");
        a.setTasadesUnidadmedida("UNIDADMEDIDA");
        a.setTasadesFecha("TIME");
        a.setTasadesValor("VALOR");
	    
	aAire.add(a);    

        int i = 1;
        while (it.hasNext())
        {    
            JsonNode n = it.next();
            
            //System.out.println(n);
            //System.out.println(n.toPrettyString());
            JsonNode r = n.get("realtime");
            
           
            Iterator<JsonNode> itRealTime = r.iterator();
            while (itRealTime.hasNext())
            {
                a = new Aire();

                a.setCodigo(n.get("codigo").asText());
                a.setNombre(n.get("nombre").asText());
                a.setUnidadmedida(n.get("unidadmedida").asText());
                a.setFecha(n.get("fecha").asText());
                a.setValor(n.get("valor").asText());
        
              
                
                JsonNode nRealTime = itRealTime.next();
        
                //System.out.println(nRealTime);
                //System.out.println(nRealTime.toPrettyString());
            
                a.setTasadesCodigo(nRealTime.get("codigo").asText());
                a.setTasadesNombre(nRealTime.get("nombre").asText());
                a.setTasadesUnidadmedida(nRealTime.get("unidadmedida").asText());
                a.setTasadesFecha(nRealTime.get("fecha").asText());
                a.setTasadesValor(nRealTime.get("valor").asText());
                
          

                if (flagError==false)
                {
                    aAire.add(a);
                    System.out.println(a);
                    i++;
                }
                else
                {
                    System.out.println("Error de tupla");
                }

            }//while itRealTime   

        }   
        return aAire;
    }
}//JsonUrlReader
