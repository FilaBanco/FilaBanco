/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package filabanco;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Cauê
 */
public class FilaBanco extends Application {
    
    public Stage stage;
    public static FilaBanco instance;
    
    
    public static FilaBanco getInstance(){
        if(instance == null )
            return new FilaBanco();
        else
            return instance;
    }
    
   /* //Método responsável pela transicao das cenas
    private Parent transicao(String fxml){
        try{
            Parent pag = (Parent) FXMLLoader.load(FilaBanco.class.getResource(fxml), null, new JavaFXBuilderFactory());
            Scene cena = stage.getScene();
            if(cena == null){
                cena = new Scene(pag);
                stage.setScene(cena);
            }else{
                stage.getScene().setRoot(pag);
            }
            stage.sizeToScene();
            stage.centerOnScreen();
            return pag;
        }catch(Exception e){
            return null; 
        }
       }
    
    
    public void goTo(String arquivo){
        try{
            transicao(arquivo + ".fxml");
        }catch(Exception e){
            
        }
    }
    
    */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FilaBanco.fxml"));
        Scene scene = new Scene(root);
        this.stage = stage;
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Controle de Fila Bancária");
        stage.centerOnScreen();
        stage.show();
    }
    
    
    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}