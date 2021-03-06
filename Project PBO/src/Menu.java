
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Fiko
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    
    
    public Menu() {
        initComponents();
        this.setTitle("Battle Pokemon");
        this.setSize(813,535);
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        ImageIcon img = new ImageIcon("src/Icon/Pokeball.png");
        this.setIconImage(img.getImage());
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tim = new javax.swing.JButton();
        info = new javax.swing.JButton();
        battle = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tim.setBackground(new java.awt.Color(102, 102, 255));
        tim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tim.setText("POKEMON TIM");
        tim.setBorder(null);
        tim.setBorderPainted(false);
        tim.setFocusPainted(false);
        tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timActionPerformed(evt);
            }
        });
        getContentPane().add(tim, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 143, 38));

        info.setBackground(new java.awt.Color(255, 255, 51));
        info.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        info.setText("INFO POKEMON");
        info.setBorder(new javax.swing.border.MatteBorder(null));
        info.setBorderPainted(false);
        info.setFocusPainted(false);
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });
        getContentPane().add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 143, 38));

        battle.setBackground(new java.awt.Color(255, 51, 51));
        battle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        battle.setText("BATTLE");
        battle.setBorder(null);
        battle.setBorderPainted(false);
        battle.setFocusPainted(false);
        battle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                battleActionPerformed(evt);
            }
        });
        getContentPane().add(battle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 143, 38));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back.setText("BACK");
        back.setBorder(null);
        back.setBorderPainted(false);
        back.setFocusPainted(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 143, 38));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/bg2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Lobby lobby = new Lobby("");
        Sound.soundbutton();
        lobby.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        Info info = new Info();
        Sound.soundbutton();
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_infoActionPerformed

    private void battleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_battleActionPerformed
        Arena battle = new Arena();
        Sound.soundbutton();
        battle.setVisible(true);
        dispose();
    }//GEN-LAST:event_battleActionPerformed

    private void timActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timActionPerformed
        Deck deck = new Deck();
        Sound.soundbutton();
        deck.setVisible(true);
        dispose();
    }//GEN-LAST:event_timActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton battle;
    private javax.swing.JButton info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton tim;
    // End of variables declaration//GEN-END:variables
}
