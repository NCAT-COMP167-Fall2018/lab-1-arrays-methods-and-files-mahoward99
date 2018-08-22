/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerstats;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mirac
 */
public class PlayerStats {
public static void readScores(String[] names, int[] scores, String filename){

Scanner reader;
    try {
        reader = new Scanner(new File(filename));
        int index = 0;
        
        while(reader.hasNext()){
        String[] infoLine = reader.nextLine().split(" ");
        names[index]= infoLine[0];
        scores[index]= Integer.parseInt(infoLine[1].trim());
        index++;
        
        }
        for(int i=0; i<79; i++){
        scores[i]= reader.nextInt();
        names[i]= reader.next();
        }
        
    } catch (FileNotFoundException ex) {
        Logger.getLogger(PlayerStats.class.getName()).log(Level.SEVERE, null, ex);
    System.err.println("File Not Found Exception");
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
String[] names = new String[80];
int[] scores = new int[80];
readScores(names, scores, args[0]);





    }
    
}
