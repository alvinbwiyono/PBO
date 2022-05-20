
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Fiko
 */
public class Battle extends javax.swing.JFrame {

    /**
     * Creates new form Battle
     */
    static ArrayList<Pokemon> musuh=new ArrayList<>();
    static ArrayList<Pokemon> tim=new ArrayList<>();
    public Battle() {
        initComponents();
        this.setTitle("Battle Pokemon");
        this.setSize(813,535);
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        ImageIcon img = new ImageIcon("src/Pokeball.png");
        this.setIconImage(img.getImage());
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
        
        Icon icon = new javax.swing.ImageIcon(getClass().getResource("bg7.jpg"));;
        if(Arena.pilArena==2){
            icon = new javax.swing.ImageIcon(getClass().getResource("bg5.jpg"));
        }else if(Arena.pilArena==3){
            icon = new javax.swing.ImageIcon(getClass().getResource("bg9.jpg"));
        }
        arena.setIcon(icon);
        
        // Untuk Clone Lobby.teams 
        for (int i = 0; i < 3; i++) {
            try {
                tim.add(Lobby.teams.get(i).clone());
            } catch (CloneNotSupportedException ex) {
                
            } catch (IndexOutOfBoundsException ex){
                
            }
        }
        
        // Untuk Isi Pokemon Musuh
        Random rand=new Random();
        musuh.clear();
        ImageIcon gmbr=null;
        boolean run=true;
        while (run&&musuh.size()<3) {
            run=false;
            Pokemon tambah=null;
            int pil=rand.nextInt(5);
            if(pil==0){
                tambah=new arctozolt();
                gmbr = new ImageIcon("src/pokemon_lawan/arctozolt.png");
            }else if(pil==1){
                tambah=new articuno();
                gmbr = new ImageIcon("src/pokemon_lawan/articuno.png");
            }else if(pil==2){
                tambah=new blastoise();
                gmbr = new ImageIcon("src/pokemon_lawan/blastoise.png");
            }else if(pil==3){
                tambah=new braviary();
                gmbr = new ImageIcon("src/pokemon_lawan/braviary.png");
            }else if(pil==4){
                tambah=new pika();
                gmbr = new ImageIcon("src/pokemon_lawan/pikachu.png");
            }
            for (int i = 0; i < musuh.size(); i++) {
                if(tambah==musuh.get(i)){
                    run=true;
                }
            }
            if(!run==true){
                musuh.add(tambah);
                musuh.get(musuh.size()-1).setGambar(gmbr);
                run=true;
            }
        }
        
        // Cetak Health dan Icon ke Layar
        healthally.setText(tim.get(0).getCurrHealth()+"/"+tim.get(0).getMaxHealth());
        healthenemy.setText(musuh.get(0).getCurrHealth()+"/"+musuh.get(0).getMaxHealth());
        ally.setIcon(tim.get(0).getGambar());
        enemy.setIcon(musuh.get(0).getGambar());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atk = new javax.swing.JButton();
        ult = new javax.swing.JButton();
        skil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        enemy = new javax.swing.JLabel();
        ally = new javax.swing.JLabel();
        healthally = new javax.swing.JLabel();
        healthenemy = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        arena = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atk.setBackground(new java.awt.Color(255, 0, 51));
        atk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        atk.setForeground(new java.awt.Color(255, 255, 255));
        atk.setText("ATTACK");
        atk.setBorder(null);
        atk.setBorderPainted(false);
        atk.setFocusable(false);
        atk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atkActionPerformed(evt);
            }
        });
        getContentPane().add(atk, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 100, 80));

        ult.setBackground(new java.awt.Color(255, 255, 0));
        ult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ult.setForeground(new java.awt.Color(0, 0, 0));
        ult.setText("ULTI");
        ult.setBorder(null);
        ult.setBorderPainted(false);
        ult.setEnabled(false);
        ult.setFocusable(false);
        ult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultActionPerformed(evt);
            }
        });
        getContentPane().add(ult, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 90, 40));

        skil.setBackground(new java.awt.Color(102, 204, 0));
        skil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        skil.setForeground(new java.awt.Color(255, 255, 255));
        skil.setText("SKILL");
        skil.setBorder(null);
        skil.setBorderPainted(false);
        skil.setFocusable(false);
        skil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skilActionPerformed(evt);
            }
        });
        getContentPane().add(skil, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 90, 40));

        jTextPane1.setEditable(false);
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPane1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextPane1.setEnabled(false);
        jTextPane1.setOpaque(false);
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 160, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 240, 220));
        getContentPane().add(enemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 180, 110));
        getContentPane().add(ally, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 200, 100));

        healthally.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        healthally.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(healthally, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 80, 30));

        healthenemy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        healthenemy.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(healthenemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 120, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        arena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg5.jpg"))); // NOI18N
        getContentPane().add(arena, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Sound.soundbutton();
        Menu next=new Menu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void atkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atkActionPerformed
        // TODO add your handling code here:
        Sound.soundbutton();
    }//GEN-LAST:event_atkActionPerformed

    private void ultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultActionPerformed
        // TODO add your handling code here:
        Sound.soundbutton();
    }//GEN-LAST:event_ultActionPerformed

    private void skilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skilActionPerformed
        // TODO add your handling code here:
        Sound.soundbutton();
    }//GEN-LAST:event_skilActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Battle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ally;
    private javax.swing.JLabel arena;
    private javax.swing.JButton atk;
    private javax.swing.JLabel enemy;
    private javax.swing.JLabel healthally;
    private javax.swing.JLabel healthenemy;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton skil;
    private javax.swing.JButton ult;
    // End of variables declaration//GEN-END:variables
}
