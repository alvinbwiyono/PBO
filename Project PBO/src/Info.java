
import java.awt.Color;
import static java.awt.Color.blue;
import static java.awt.Color.green;
import static java.awt.Color.red;
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
public class Info extends javax.swing.JFrame {

    /**
     * Creates new form Info
     */
    Pokemon cet;
    String hasil;
    public Info() {
        initComponents();
        this.setTitle("Battle Pokemon");
        this.setSize(813,535);
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        ImageIcon img = new ImageIcon("src/Pokeball.png");
        this.setIconImage(img.getImage());
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
        pokeball.setVisible(true);
        stats.setVisible(false);
//        arcticunoImage.setVisible(false);
//        arctozoltImage.setVisible(false);
//        blastoiseImage.setVisible(false);
//        braviaryImage.setVisible(false);
//        pikachuImage.setVisible(false);
        skill.setVisible(false);
        ulti.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        articuno = new javax.swing.JButton();
        blastoise = new javax.swing.JButton();
        braviary = new javax.swing.JButton();
        pikachu = new javax.swing.JButton();
        arctozolt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        stats = new javax.swing.JLabel();
        skill = new javax.swing.JLabel();
        ulti = new javax.swing.JLabel();
        pokeball = new javax.swing.JButton();
        ATTACK = new javax.swing.JLabel();
        HP1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        articuno.setBackground(new java.awt.Color(204, 204, 204));
        articuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/articuno.png"))); // NOI18N
        articuno.setBorderPainted(false);
        articuno.setFocusPainted(false);
        articuno.setOpaque(false);
        articuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                articunoActionPerformed(evt);
            }
        });
        getContentPane().add(articuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 100, 100));

        blastoise.setBackground(new java.awt.Color(204, 204, 204));
        blastoise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/blastoise-gmax.png"))); // NOI18N
        blastoise.setBorderPainted(false);
        blastoise.setFocusPainted(false);
        blastoise.setOpaque(false);
        blastoise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blastoiseActionPerformed(evt);
            }
        });
        getContentPane().add(blastoise, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 100, 100));

        braviary.setBackground(new java.awt.Color(204, 204, 204));
        braviary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/braviary.png"))); // NOI18N
        braviary.setBorderPainted(false);
        braviary.setFocusPainted(false);
        braviary.setOpaque(false);
        braviary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                braviaryActionPerformed(evt);
            }
        });
        getContentPane().add(braviary, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 100, 100));

        pikachu.setBackground(new java.awt.Color(204, 204, 204));
        pikachu.setForeground(new java.awt.Color(204, 204, 204));
        pikachu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/pikachu.png"))); // NOI18N
        pikachu.setBorderPainted(false);
        pikachu.setFocusPainted(false);
        pikachu.setOpaque(false);
        pikachu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pikachuActionPerformed(evt);
            }
        });
        getContentPane().add(pikachu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 100, 100));

        arctozolt.setBackground(new java.awt.Color(204, 204, 204));
        arctozolt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/arctozolt.png"))); // NOI18N
        arctozolt.setBorderPainted(false);
        arctozolt.setFocusPainted(false);
        arctozolt.setOpaque(false);
        arctozolt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arctozoltActionPerformed(evt);
            }
        });
        getContentPane().add(arctozolt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ARCTOZOLT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ARCTICUNO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BLASTOISE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BRAVIARY");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PIKACHU");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("POKEMON INFO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        stats.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stats.setForeground(new java.awt.Color(255, 255, 255));
        stats.setText("STATS : ");
        getContentPane().add(stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        skill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        skill.setForeground(new java.awt.Color(255, 255, 255));
        skill.setText("SKILL : ");
        getContentPane().add(skill, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        ulti.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ulti.setForeground(new java.awt.Color(255, 255, 255));
        ulti.setText("ULTI : ");
        getContentPane().add(ulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        pokeball.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pokeball.png"))); // NOI18N
        pokeball.setBorderPainted(false);
        pokeball.setContentAreaFilled(false);
        pokeball.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokeballActionPerformed(evt);
            }
        });
        getContentPane().add(pokeball, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 140, 120));

        ATTACK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ATTACK.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ATTACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 80, 20));

        HP1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HP1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(HP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 80, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg9.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void arctozoltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arctozoltActionPerformed
//        arcticunoImage.setVisible(false);
//        arctozoltImage.setVisible(true);
//        blastoiseImage.setVisible(false);
//        braviaryImage.setVisible(false);
//        pikachuImage.setVisible(false);
        Sound.soundbutton();
        Icon icon = new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/arctozolt.png"));
        pokeball.setIcon(icon);
        stats.setVisible(true);
        skill.setVisible(true);
        ulti.setVisible(true);
        cet=new arctozolt();
        infopokemon<Integer> iObj = new infopokemon<Integer>(cet.getMaxHealth());
        HP1.setText("HP : "+iObj.getCetak());
        ATTACK.setText("Attack : "+cet.getDamage());
        
    }//GEN-LAST:event_arctozoltActionPerformed

    private void articunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_articunoActionPerformed
//        arcticunoImage.setVisible(true);
//        arctozoltImage.setVisible(false);
//        blastoiseImage.setVisible(false);
//        braviaryImage.setVisible(false);
//        pikachuImage.setVisible(false);
        Sound.soundbutton();
        Icon icon = new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/articuno.png"));
        pokeball.setIcon(icon);
        stats.setVisible(true);
        skill.setVisible(true);
        ulti.setVisible(true);
        cet=new articuno();
        infopokemon<Integer> iObj = new infopokemon<Integer>(cet.getMaxHealth());
        HP1.setText("HP : "+iObj.getCetak());
        ATTACK.setText("Attack : "+cet.getDamage());
    }//GEN-LAST:event_articunoActionPerformed

    private void blastoiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blastoiseActionPerformed
//        arcticunoImage.setVisible(false);
//        arctozoltImage.setVisible(false);
//        blastoiseImage.setVisible(true);
//        braviaryImage.setVisible(false);
//        pikachuImage.setVisible(false);
        Sound.soundbutton();
        Icon icon = new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/blastoise-gmax.png"));
        pokeball.setIcon(icon);
        stats.setVisible(true);
        skill.setVisible(true);
        ulti.setVisible(true);
        cet=new blastoise();
        infopokemon<Integer> iObj = new infopokemon<Integer>(cet.getMaxHealth());
        HP1.setText("HP : "+iObj.getCetak());
        ATTACK.setText("Attack : "+cet.getDamage());
    }//GEN-LAST:event_blastoiseActionPerformed

    private void braviaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_braviaryActionPerformed
//        arcticunoImage.setVisible(false);
//        arctozoltImage.setVisible(false);
//        blastoiseImage.setVisible(false);
//        braviaryImage.setVisible(true);
//        pikachuImage.setVisible(false);
        Sound.soundbutton();
        Icon icon = new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/braviary.png"));
        pokeball.setIcon(icon);
        stats.setVisible(true);
        skill.setVisible(true);
        ulti.setVisible(true);
        cet=new braviary();
        infopokemon<Integer> iObj = new infopokemon<Integer>(cet.getMaxHealth());
        HP1.setText("HP : "+iObj.getCetak());
        ATTACK.setText("Attack : "+cet.getDamage());
    }//GEN-LAST:event_braviaryActionPerformed

    private void pikachuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pikachuActionPerformed
//        arcticunoImage.setVisible(false);
//        arctozoltImage.setVisible(false);
//        blastoiseImage.setVisible(false);
//        braviaryImage.setVisible(false);
//        pikachuImage.setVisible(true);
        Sound.soundbutton();
        Icon icon = new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/pikachu.png"));
        pokeball.setIcon(icon);
        stats.setVisible(true);
        skill.setVisible(true);
        ulti.setVisible(true);
        cet=new pika();
        infopokemon<Integer> iObj = new infopokemon<Integer>(cet.getMaxHealth());
        HP1.setText("HP : "+iObj.getCetak());
        ATTACK.setText("Attack : "+cet.getDamage());
    }//GEN-LAST:event_pikachuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu menu = new Menu();
        Sound.soundbutton();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pokeballActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokeballActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_pokeballActionPerformed

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
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Info().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ATTACK;
    private javax.swing.JLabel HP1;
    private javax.swing.JButton arctozolt;
    private javax.swing.JButton articuno;
    private javax.swing.JButton blastoise;
    private javax.swing.JButton braviary;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton pikachu;
    private javax.swing.JButton pokeball;
    private javax.swing.JLabel skill;
    private javax.swing.JLabel stats;
    private javax.swing.JLabel ulti;
    // End of variables declaration//GEN-END:variables
}
