/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprintword;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *Baum123
 * @author Marc
 */
public class JavaPrintWord {

    /**
     * Baum123
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine();
        String[][] array = new String[255][9];
        array[(int) '!'][0] = ".##";
        array[(int) '!'][1] = ".##";
        array[(int) '!'][2] = ".##";
        array[(int) '!'][3] = ".##";
        array[(int) '!'][4] = ".##";
        array[(int) '!'][5] = ".##";
        array[(int) '!'][6] = "...";
        array[(int) '!'][7] = ".##";
        array[(int) '!'][8] = ".##";
        
        array[(int) 'e'][0] = "/########";
        array[(int) 'e'][1] = "/###.....";
        array[(int) 'e'][2] = ".###.....";
        array[(int) 'e'][3] = "/###.....";
        array[(int) 'e'][4] = "/#######.";
        array[(int) 'e'][5] = ".###.....";
        array[(int) 'e'][6] = "/###.....";
        array[(int) 'e'][7] = "/###.....";
        array[(int) 'e'][8] = "/########";
        for (int i = 0; i<9; i++) {
            for (int j = 0; j< input.length(); j++){
                char letter = input.charAt(j);
                System.out.print(array[letter][i]);
            }
            System.out.println("");
        }                                      
                
        
    }
    
}
