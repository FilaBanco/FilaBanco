/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logger;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cauê
 */
public class Gerador {
    public static void main(String[] args) {
    Logger meulog = Logger.getLogger("LOG");
    meulog.log(Level.FINEST, "Alto detalhamento");
    meulog.log(Level.FINER, "Médio detalhamento");
    meulog.log(Level.FINE, "Baixo detalhamento");
    meulog.log(Level.INFO, "Informação");
    meulog.log(Level.WARNING, "Cuidado");
    meulog.log(Level.SEVERE, "Severo");
  }
    
}
