
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Sound {
    static File f;
    static AudioInputStream audioIn=null;
    static Clip clip = null;
    static ArrayList<Pokemon> teams = new ArrayList<>();
    
    public static void soundbutton(){
        f = new File("src/sound/sfx/Buttons sound.wav");
        try {
            audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
        } catch (FileNotFoundException ex){
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            clip.open(audioIn);
        } catch (NullPointerException ex){ 
             
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        volume.setValue(-10f);
        clip.start();
    } 
    
    
    
    ///sfx 2
    public static void gameover(){
        f = new File("src/sound/sfx/game_over.wav");
        try {
            audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
        } catch (FileNotFoundException ex){
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            clip.open(audioIn);
        } catch (NullPointerException ex){ 
             
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        volume.setValue(-10f);
        clip.start();
    } 
    
    ///sfx 3
    public static void start(){
        f = new File("src/sound/sfx/start.wav");
        try {
            audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
        } catch (FileNotFoundException ex){
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            clip.open(audioIn);
        } catch (NullPointerException ex){ 
             
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        volume.setValue(-10f);
        clip.start();
    } 
    //sfx 4
    public static void win(){
        f = new File("src/sound/sfx/win.wav");
        try {
            audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
        } catch (FileNotFoundException ex){
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            clip.open(audioIn);
        } catch (NullPointerException ex){ 
             
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        volume.setValue(-10f);
        clip.start();
    } 
    
    ///sfx lose
    public static void lose(){
        f = new File("src/sound/sfx/lose.wav");
        try {
            audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
        } catch (FileNotFoundException ex){
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            clip.open(audioIn);
        } catch (NullPointerException ex){ 
             
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        volume.setValue(-10f);
        clip.start();
    } 
    
    //sfx attack
    public static void attack(){
        f = new File("src/sound/sfx/attack.wav");
        try {
            audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
        } catch (FileNotFoundException ex){
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            clip.open(audioIn);
        } catch (NullPointerException ex){ 
             
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        volume.setValue(-10f);
        clip.start();
    } 
    
    ///sfx chose music
    public static void chose(){
        f = new File("src/sound/sfx/chose.wav");
        try {
            audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
        } catch (FileNotFoundException ex){
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            clip.open(audioIn);
        } catch (NullPointerException ex){ 
             
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        volume.setValue(-10f);
        clip.start();
    } 
    

}

