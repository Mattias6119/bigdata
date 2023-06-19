/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.beam.examples;

/**
 *
 * @author Matias
 */
public class Stations {
    
   
    private String Time;
    
        
    //Lines
    private String linesName;
    private String linesId;
 
    
    //Stations
    private String estacionName;
    private String estacionId;
    private String estacionStatus;
    private String estacionLines;
    private String estacionDescription;
    
    public Stations() {
    }

    public String geTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = Time;
    }
        
    public String getLinesName() {
        return linesName;
    }

    public void setLinesName(String linesName) {
        this.linesName = linesName;
    }


    public String getLinesId() {
        return linesId;
    }

    public void setLinesId(String linesId) {
        this.linesId= linesId;
    }

    public String getEstacionName() {
        return estacionName;
    }

    public void setEstacionName(String estacionName) {
        this.estacionName = estacionName;
    }

    
    public String getEstacionId() {
        return estacionId;
    }

    public void setEstacionId(String estacionId) {
        this.estacionId= estacionId;
    }
    
      public String getEstacionStatus() {
        return estacionStatus;
    }

    public void setEstacionStatus(String estacionStatus) {
        this.estacionStatus = estacionStatus;
    }

    
    public String getEstacionLines() {
        return estacionLines;
    }

    public void setEstacionLines(String estacionLines) {
        this.estacionLines = estacionLines;
    }
        
    public String getEstacionDescription() {
        return estacionDescription;
    }

    public void setEstacionDescription(String estacionDescription) {
        this.estacionDescription = estacionDescription;
    }
    @Override
    public String toString() {
        return "Station{" + "time=" + time + ", linesName=" + linesName + ", linesId=" + linesId + ", estacionName=" + estacionName + ", estacionId=" + estacionId + ", estacionStatus=" + estacionStatus + ", estacionLines=" + estacionLines + ", estacionDescription=" + estacionDescription + '}';
    }
    
    public String toCSV()
    {
        return "" + time + "," + linesName + "," + linesId + "," + estacionName + "," + estacionId + "," + estacionStatus + "," + estacionLines + "," + estacionDescription + "";
    }

}//Aire
