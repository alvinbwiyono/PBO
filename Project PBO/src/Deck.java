
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Geo.C
 */
public class Deck extends javax.swing.JFrame {

    /**
     * Creates new form Deck
     */
    public Deck() {
        initComponents();
        this.setTitle("Battle Pokemon");
        this.setSize(813,535);
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        ImageIcon img = new ImageIcon("src/Pokeball.png");
        this.setIconImage(img.getImage());
        // membuat titik x dan y
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

        Arctozolt = new javax.swing.JButton();
        Articuno = new javax.swing.JButton();
        Blastoise = new javax.swing.JButton();
        Braviary = new javax.swing.JButton();
        Pikachu = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        Poke2 = new javax.swing.JButton();
        Poke3 = new javax.swing.JButton();
        Poke1 = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Load = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Arctozolt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/arctozolt.png"))); // NOI18N
        Arctozolt.setBorderPainted(false);
        Arctozolt.setContentAreaFilled(false);
        getContentPane().add(Arctozolt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 90, 90));

        Articuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/articuno.png"))); // NOI18N
        Articuno.setBorderPainted(false);
        Articuno.setContentAreaFilled(false);
        getContentPane().add(Articuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 110, 120));

        Blastoise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/blastoise-gmax.png"))); // NOI18N
        Blastoise.setBorderPainted(false);
        Blastoise.setContentAreaFilled(false);
        getContentPane().add(Blastoise, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 140, 120));

        Braviary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/braviary.png"))); // NOI18N
        Braviary.setBorderPainted(false);
        Braviary.setContentAreaFilled(false);
        getContentPane().add(Braviary, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 120, 120));

        Pikachu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/pikachu.png"))); // NOI18N
        Pikachu.setBorderPainted(false);
        Pikachu.setContentAreaFilled(false);
        getContentPane().add(Pikachu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 90, 80));

        Back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Back.setText("Back");
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 40));

        Title.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 51, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("  My Team");
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 189, 43));

        Poke2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pokeball.png"))); // NOI18N
        Poke2.setBorderPainted(false);
        Poke2.setContentAreaFilled(false);
        getContentPane().add(Poke2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 140, 120));

        Poke3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pokeball.png"))); // NOI18N
        Poke3.setBorderPainted(false);
        Poke3.setContentAreaFilled(false);
        getContentPane().add(Poke3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 140, 120));

        Poke1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pokeball.png"))); // NOI18N
        Poke1.setBorderPainted(false);
        Poke1.setContentAreaFilled(false);
        getContentPane().add(Poke1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 140, 120));

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, -1, -1));

        Load.setText("Load");
        getContentPane().add(Load, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg7.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveActionPerformed

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
            java.util.logging.Logger.getLogger(Deck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deck().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Arctozolt;
    private javax.swing.JButton Articuno;
    private javax.swing.JButton Back;
    private javax.swing.JLabel Background;
    private javax.swing.JButton Blastoise;
    private javax.swing.JButton Braviary;
    private javax.swing.JButton Load;
    private javax.swing.JButton Pikachu;
    private javax.swing.JButton Poke1;
    private javax.swing.JButton Poke2;
    private javax.swing.JButton Poke3;
    private javax.swing.JButton Save;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
