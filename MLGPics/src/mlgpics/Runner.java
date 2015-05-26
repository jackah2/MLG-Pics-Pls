/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mlgpics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author jhenhap7
 */
public class Runner {
    
    public static void main(String[] args){
        JFrame frame = new JFrame("MLG b0ss");
        frame.setTitle("Frame");
        frame.setSize(1000,700);
        frame.setLocation(100,100);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Contents());
        frame.setVisible(true);
        playSound("ey_bOss.wav");
    }
    
    private static String getURL(String url){
        return Runner.class.getResource(url).toString().replace("file:", "");
    }
    
    public static void playSound(String url) {
        System.out.println(getURL(url));
        InputStream in = null;
        try {
            in = new FileInputStream(getURL(url));
        } catch (FileNotFoundException ex) {
            Logger.getLogger("\"" + url + "\" cannot be found");
        }
        AudioStream as = null;
        try {
            as = new AudioStream(in);
        } catch (IOException ex) {
            Logger.getLogger("in is null");
        }
        AudioPlayer.player.start(as);
    }
}