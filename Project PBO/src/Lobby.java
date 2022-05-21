
import java.awt.Dimension;
import java.awt.Toolkit;
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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Aldiaafn
 */
public class Lobby extends javax.swing.JFrame {

    /**
     * Creates new form Lobby
     */
    File f;
    static AudioInputStream audioIn=null;
    static Clip clip = null;
    static ArrayList<Pokemon> teams = new ArrayList<>();
    
    public Lobby(){
        f = new File("src/sound/audio/Lagu 1.wav");
        initComponents();
        this.setTitle("Battle Pokemon");
        this.setSize(813,535);
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        ImageIcon img = new ImageIcon("src/Icon/Pokeball.png");
        this.setIconImage(img.getImage());
        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
        
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
        volume.setValue(-20f);
    clip.start();
    clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public Lobby(String isi){
        initComponents();
        this.setTitle("Battle Pokemon");
        this.setSize(813,535);
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        ImageIcon img = new ImageIcon("src/Icon/Pokeball.png");
        this.setIconImage(img.getImage());
        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
    }
    
    public static void gantiLagu(File f1){
        try {
            clip.stop();
            audioIn = AudioSystem.getAudioInputStream(f1.toURI().toURL());
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
        volume.setValue(-20f);
    clip.start();
    clip.loop(Clip.LOOP_CONTINUOUSLY);
   }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        play = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Setting = new javax.swing.JButton();
        Exit1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        play.setBackground(new java.awt.Color(255, 255, 0));
        play.setFont(new java.awt.Font("Square721 Cn BT", 1, 14)); // NOI18N
        play.setText("PLAY");
        play.setFocusPainted(false);
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });
        getContentPane().add(play, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 90, 30));

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setFont(new java.awt.Font("Square721 Cn BT", 1, 14)); // NOI18N
        jButton3.setText("INFO");
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 90, 30));

        Setting.setFont(new java.awt.Font("Square721 Cn BT", 1, 14)); // NOI18N
        Setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/sett.png"))); // NOI18N
        Setting.setToolTipText("");
        Setting.setAutoscrolls(true);
        Setting.setBorder(null);
        Setting.setBorderPainted(false);
        Setting.setContentAreaFilled(false);
        Setting.setFocusPainted(false);
        Setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingActionPerformed(evt);
            }
        });
        getContentPane().add(Setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 60, 50));

        Exit1.setFont(new java.awt.Font("Square721 Cn BT", 1, 14)); // NOI18N
        Exit1.setText("EXIT");
        Exit1.setFocusPainted(false);
        Exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit1ActionPerformed(evt);
            }
        });
        getContentPane().add(Exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/pokemon-center (1).gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -20, 870, 540));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Sound.soundbutton();
        JTextPane jtp = new JTextPane();
        Document doc = jtp.getDocument();
        ImageIcon img = new ImageIcon("src/Icon/Pokeball.png");
        try {
            doc.insertString(doc.getLength(), "Created By : \n"
                    + "221116935 - ALDI AFENDIYANTO\n"
                    + "221116936 - ALVIN BERNARD WIYONO\n"
                    + "221116947 - DARRELL FIKO ALEXANDER\n" 
                    + "221116958 - GEOVANN CHANDRA", new SimpleAttributeSet());
        } catch (BadLocationException ex) {
            Logger.getLogger(Lobby.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,jtp, "INFO",JOptionPane.INFORMATION_MESSAGE);
        Sound.soundbutton();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void SettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingActionPerformed
        // TODO add your handling code here:
        Sound.soundbutton();
        new Settings(f).setVisible(true);
    }//GEN-LAST:event_SettingActionPerformed

    private void Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit1ActionPerformed
        // TODO add your handling code here:
        ImageIcon img=new ImageIcon("src/Icon/Pokeball.png");
        Sound.soundbutton();
        String[] options = new String[2];
        options[0] = "Cancel";
        options[1] = "Exit"; 
        int jawab = JOptionPane.showOptionDialog(this, 
                   "Do You Want to Exit?", 
                    "Exit",
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE,img, options, null);
        
        Sound.soundbutton();
        if(jawab == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(this, "Thank You For Playing!");
            System.exit(0);
        }
    }//GEN-LAST:event_Exit1ActionPerformed

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        // TODO add your handling code here:
        Sound.soundbutton();
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_playActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit1;
    private javax.swing.JButton Setting;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JButton play;
    // End of variables declaration//GEN-END:variables
}
