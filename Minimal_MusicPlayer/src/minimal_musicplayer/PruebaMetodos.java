/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimal_musicplayer;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
/**
 *
 * @author RSA JdlF
 */
public class PruebaMetodos {
    public static void playSomething(String path){
        //Abre el archivo
        File file = new File(path);
        if(file.exists()){
            //Crea el media de javaFX
            Media sound = new Media(file.toURI().toString());
            //Crea el player
            MediaPlayer player = new MediaPlayer(sound);            
            //Reproduce el player
            player.play();
        }
    }
}
