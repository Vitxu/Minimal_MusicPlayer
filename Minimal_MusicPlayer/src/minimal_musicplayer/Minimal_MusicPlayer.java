/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimal_musicplayer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 *
 * @author human
 */
public class Minimal_MusicPlayer extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        TextField textField = new TextField ();
        btn.setText("Play some funk");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PruebaMetodos.playSomething(textField.getText());
                System.out.println("Playing sound from the path " + textField.getText());
            }
        });
        
        StackPane root = new StackPane();
        textField.setTranslateY(-20);
        btn.setTranslateY(20);
        root.getChildren().addAll(btn, textField);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
