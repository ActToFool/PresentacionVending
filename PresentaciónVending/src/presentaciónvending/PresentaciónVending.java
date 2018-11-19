/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentaciónvending;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 final Label clock = new Label();
final DateFormat format = DateFormat.getInstance();
final Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), 
new EventHandler() 
{
@Override  
    public void handle(ActionEvent event) 
    {
      final Calendar cal = Calendar.getInstance();
      clock.setText(format.format(cal.getTime());
    }
});

timeline.setCycleCount(Animation.INDEFINITE);
timeline.play();
 * 
 * 
 * 
 * @author Emanuel Álvarez
 */
public class PresentaciónVending extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLVista.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        //xd
    }
    
}
