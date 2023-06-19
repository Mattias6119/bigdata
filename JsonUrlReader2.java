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
import org.apache.beam.examples.Stations;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Matias
 */
public class JsonUrlReader2 {

    public JsonUrlReader2()
    {
        
    }
      
    public ArrayList<Lines> cargarURL() throws StreamReadException, DatabindException, MalformedURLException, IOException {
        String url = "https://api.xor.cl/red/metro-network";
        
        ArrayList<Stations> aStations = new ArrayList();

        //JsonNode node = new JsonUrlReader().get(url);
        //System.out.println(node.toPrettyString());
        
        
        ObjectMapper mapper = new ObjectMapper();

	System.out.println("Inicando mapper en JsonUrlReader");
        JsonNode node = mapper.readTree(new URL(url));

        System.out.println("Finalizando mapper en JsonUrlReader");
        
        
        Iterator<JsonNode> it = node.iterator();
        
        Stations a = null;
        a = new Stations();
        a.setTime("REALTIMEDATETIME");
        a.setLinesName("NAME");
        a.setLinesId("LINEID");
        a.setEstacionName("NOMBRE");
        a.setEstacionId("ESTACIONID");
        a.setEstacionStatus("STATUS");
        a.setEstacionLines("LINES");
        a.setEstacionDescription("DESCRIPTION");
     
	    
	aStations.add(a);    

        int i = 1;
        while (it.hasNext())
        {    
            JsonNode n = it.next();
            
            //System.out.println(n);
            //System.out.println(n.toPrettyString());
            JsonNode r = n.get("lines");
            
           
            Iterator<JsonNode> it = r.iterator();
            while (itLines.hasNext())
            {
                a = new Stations();
            
                a.setId(String.valueOf(i));
                a.setTime(n.get("datetime").asText());
    
                
                JsonNode nLines = itLines.next();
        
                //System.out.println(nRealTime);
                //System.out.println(nRealTime.toPrettyString());
            
                a.setLinesName(nLines.get("name").asText());
                a.setLinesId(nLines.get("id").asText());
                
                //System.out.println("\t"+nRealTime.get("code"));
                //System.out.println("\t"+nRealTime.get("name"));
                //System.out.println("\t"+nRealTime.get("datetime"));
                
                JsonNode nEstacion = nLines.get("estacion");
                
                boolean flagError = false;
                try
                {
                
                    a.setEstacionName(nEstacion.get("name").asText());
                    a.setEstacionId(nEstacion.get("id").asText());
                    a.setEstacionStatus(nEstacion.get("status").asText());
                    a.setEstacionLines(nEstacion.get("lines").asText());
                    a.setEstacionDescription(nEstacion.get("description").asText());
		}
                catch (Exception ex)
                {
                    flagError = true;
                }

                if (flagError==false)
                {
                    aStations.add(a);
                    System.out.println(a);
                    i++;
                }
                else
                {
                    System.out.println("Error de tupla");
                }

            }//while itRealTime   

        }   
        return aStations;
    }
}  //JsonUrlReader
