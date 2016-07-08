/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

import crashinthecaribbean.CrashInTheCaribbean;
import java.io.PrintWriter;

/**
 *
 * @author josecovarrubias
 */
public class ErrorView {
    private static final PrintWriter errorFile = CrashInTheCaribbean.getOutFile();
    private static final PrintWriter logFile = CrashInTheCaribbean.getLogFile();
    
    public static void display(String className, String errorMessage){
            errorFile.println("---------------"
                            + "\n SNAP " + errorMessage
                            + "\n ---------------------------");
            
            logFile.println(className + " - " + errorMessage);
    }

//    static void display(String _Hey_bro_not_that_letter_Try_one_more_tim) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
