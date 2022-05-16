
import java.awt.Dimension;
import java.awt.Toolkit;
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
public class Arena extends javax.swing.JFrame {
    
    static int pilArena=1;
    Deck deck;
    
    public Arena() {
        initComponents();
        this.setTitle("Battle Pokemon");
        this.setSize(813,535);
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        ImageIcon img = new ImageIcon("src/Pokeball.png");
        this.setIconImage(img.getImage());
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
        Icon icon = new javax.swing.ImageIcon(getClass().getResource("bg7.jpg"));
        arena.setIcon(icon);
        previous.setVisible(false);
        
        for (int i = 0; i < Lobby.teams.size(); i++) {
            Pokemon poke = Lobby.teams.get(i);
            if(i==0){
                Poke1.setIcon(poke.getGambar());
            }else if(i==1){
                Poke2.setIcon(poke.getGambar());
            }else if(i==2){
                Poke3.setIcon(poke.getGambar());
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        next = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        start = new javax.swing.JButton();
        Poke1 = new javax.swing.JButton();
        Poke2 = new javax.swing.JButton();
        Poke3 = new javax.swing.JButton();
        arena = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        next.setText("NEXT");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 170, 80, -1));

        previous.setText("PREVIOUS");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });
        getContentPane().add(previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, -1));

        start.setText("START");
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, -1, -1));

        Poke1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pokeball.png"))); // NOI18N
        Poke1.setBorderPainted(false);
        Poke1.setContentAreaFilled(false);
        Poke1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Poke1ActionPerformed(evt);
            }
        });
        getContentPane().add(Poke1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 140, 120));

        Poke2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pokeball.png"))); // NOI18N
        Poke2.setBorderPainted(false);
        Poke2.setContentAreaFilled(false);
        Poke2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Poke2ActionPerformed(evt);
            }
        });
        getContentPane().add(Poke2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 140, 120));

        Poke3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pokeball.png"))); // NOI18N
        Poke3.setBorderPainted(false);
        Poke3.setContentAreaFilled(false);
        Poke3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Poke3ActionPerformed(evt);
            }
        });
        getContentPane().add(Poke3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 140, 120));

        arena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg7.jpg"))); // NOI18N
        getContentPane().add(arena, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 800, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        if(pilArena!=1){
            pilArena--;
        }
        gambarArena();
        if(pilArena==1){
            previous.setVisible(false);
        }
        next.setVisible(true);
    }//GEN-LAST:event_previousActionPerformed
    
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        if(pilArena!=3){
            pilArena++;
        }
        gambarArena();
        if(pilArena==3){
            next.setVisible(false);
        }
        previous.setVisible(true);
    }//GEN-LAST:event_nextActionPerformed

    private void Poke1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Poke1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Poke1ActionPerformed

    private void Poke2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Poke2ActionPerformed

    }//GEN-LAST:event_Poke2ActionPerformed

    private void Poke3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Poke3ActionPerformed

    }//GEN-LAST:event_Poke3ActionPerformed
    
    private Icon bgArena(){
        Icon icon = new javax.swing.ImageIcon(getClass().getResource("bg7.jpg"));
        if(pilArena==1){
            icon = new javax.swing.ImageIcon(getClass().getResource("bg7.jpg"));
        }else if(pilArena==2){
            icon = new javax.swing.ImageIcon(getClass().getResource("bg5.jpg"));
        }else if(pilArena==3){
            icon = new javax.swing.ImageIcon(getClass().getResource("bg9.jpg"));
        }
        return icon;
    }
    
    private void gambarArena(){
        if(pilArena==1){
            Icon icon = new javax.swing.ImageIcon(getClass().getResource("bg7.jpg"));
            arena.setIcon(icon);
        }else if(pilArena==2){
            Icon icon = new javax.swing.ImageIcon(getClass().getResource("bg5.jpg"));
            arena.setIcon(icon);
        }else if(pilArena==3){
            Icon icon = new javax.swing.ImageIcon(getClass().getResource("bg9.jpg"));
            arena.setIcon(icon);
        }
    }
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
            java.util.logging.Logger.getLogger(Arena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arena().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Poke1;
    private javax.swing.JButton Poke2;
    private javax.swing.JButton Poke3;
    private javax.swing.JLabel arena;
    private javax.swing.JButton back;
    private javax.swing.JButton next;
    private javax.swing.JButton previous;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
