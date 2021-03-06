
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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
    static ArrayList<Pokemon> teams = new ArrayList<>();
    static boolean[] poke = new boolean[3];

    public Deck() {
        initComponents();
        this.setTitle("Battle Pokemon");
        this.setSize(813, 535);
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        ImageIcon img = new ImageIcon("src/Icon/Pokeball.png");
        this.setIconImage(img.getImage());
        // membuat titik x dan y
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);

        for (int i = 0; i < 3; i++) {
            poke[i] = false;
        }
        teams.clear();
        for (int i = 0; i < 3; i++) {
            teams.add(null);
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

        Arctozolt = new javax.swing.JButton();
        Articuno = new javax.swing.JButton();
        Blastoise = new javax.swing.JButton();
        Braviary = new javax.swing.JButton();
        Pikachu = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        Poke1 = new javax.swing.JButton();
        Poke2 = new javax.swing.JButton();
        Poke3 = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Load = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Arctozolt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/arctozolt.png"))); // NOI18N
        Arctozolt.setBorderPainted(false);
        Arctozolt.setContentAreaFilled(false);
        Arctozolt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArctozoltActionPerformed(evt);
            }
        });
        getContentPane().add(Arctozolt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 90, 90));

        Articuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/articuno.png"))); // NOI18N
        Articuno.setBorderPainted(false);
        Articuno.setContentAreaFilled(false);
        Articuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArticunoActionPerformed(evt);
            }
        });
        getContentPane().add(Articuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 110, 120));

        Blastoise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/blastoise-gmax.png"))); // NOI18N
        Blastoise.setBorderPainted(false);
        Blastoise.setContentAreaFilled(false);
        Blastoise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlastoiseActionPerformed(evt);
            }
        });
        getContentPane().add(Blastoise, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 140, 120));

        Braviary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/braviary.png"))); // NOI18N
        Braviary.setBorderPainted(false);
        Braviary.setContentAreaFilled(false);
        Braviary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BraviaryActionPerformed(evt);
            }
        });
        getContentPane().add(Braviary, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 120, 120));

        Pikachu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/pikachu.png"))); // NOI18N
        Pikachu.setBorderPainted(false);
        Pikachu.setContentAreaFilled(false);
        Pikachu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PikachuActionPerformed(evt);
            }
        });
        getContentPane().add(Pikachu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 90, 80));

        Back.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("Back");
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.setFocusPainted(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 40));

        Title.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 51, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("  My Team");
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 189, 43));

        Poke1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Pokeball.png"))); // NOI18N
        Poke1.setBorderPainted(false);
        Poke1.setContentAreaFilled(false);
        Poke1.setFocusPainted(false);
        Poke1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Poke1ActionPerformed(evt);
            }
        });
        getContentPane().add(Poke1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 140, 120));

        Poke2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Pokeball.png"))); // NOI18N
        Poke2.setBorderPainted(false);
        Poke2.setContentAreaFilled(false);
        Poke2.setFocusPainted(false);
        Poke2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Poke2ActionPerformed(evt);
            }
        });
        getContentPane().add(Poke2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 140, 120));

        Poke3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Pokeball.png"))); // NOI18N
        Poke3.setBorderPainted(false);
        Poke3.setContentAreaFilled(false);
        Poke3.setFocusPainted(false);
        Poke3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Poke3ActionPerformed(evt);
            }
        });
        getContentPane().add(Poke3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 140, 120));

        Save.setText("Save");
        Save.setFocusPainted(false);
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, -1, -1));

        Load.setText("Load");
        Load.setFocusPainted(false);
        Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadActionPerformed(evt);
            }
        });
        getContentPane().add(Load, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/bg7.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        // Simpan deck untuk nantinya digunakan battle
        Sound.soundbutton();
        boolean full = true;
        for (int i = 0; i < 3; i++) {
            if (poke[i] == false) {
                full = false;
            }
        }

        if (full) {
            Lobby.teams.clear();
            for (int i = 0; i < 3; i++) {
                Pokemon temp = teams.get(i);
                if (temp instanceof arctozolt) {
                    Lobby.teams.add(new arctozolt());
                } else if (temp instanceof articuno) {
                    Lobby.teams.add(new articuno());
                } else if (temp instanceof blastoise) {
                    Lobby.teams.add(new blastoise());
                } else if (temp instanceof braviary) {
                    Lobby.teams.add(new braviary());
                } else if (temp instanceof pika) {
                    Lobby.teams.add(new pika());
                }
            }

            Save sf = new Save(teams);
            try {
                FileOutputStream fos = new FileOutputStream("save.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                oos.writeObject(sf);
                oos.close();
                fos.close();
                JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan!");
                Sound.soundbutton();

            } catch (Exception e) {
                System.out.println("There's Problem on Save!" + e);
            }
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Menu menu = new Menu();
        Sound.soundbutton();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadActionPerformed
        // TODO add your handling code here:
        Sound.soundbutton();
        try {
            FileInputStream fis = new FileInputStream("save.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Save save = (Save) ois.readObject();
            Lobby.teams = save.tim;
            ois.close();
            fis.close();
            Sound.soundbutton();
        } catch (FileNotFoundException ex) {
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not Found!");
        } catch (IOException e){
            System.out.println("There's Problem on load!" + e);
        }
        // Load deck yang sebelumnya pernah di set
        if (Lobby.teams.size() == 3) {
            // Reset Visual
            Arctozolt.setVisible(true);
            Articuno.setVisible(true);
            Blastoise.setVisible(true);
            Braviary.setVisible(true);
            Pikachu.setVisible(true);

            Poke1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Icon/Pokeball.png")));
            Poke2.setIcon(new javax.swing.ImageIcon(getClass().getResource("Icon/Pokeball.png")));
            Poke3.setIcon(new javax.swing.ImageIcon(getClass().getResource("Icon/Pokeball.png")));
            this.teams.clear();
            for (int i = 0; i < 3; i++) {
                this.teams.add(null);
            }

            // Load
            for (int i = 0; i < 3; i++) {
                Pokemon temp = Lobby.teams.get(i);
                if (temp instanceof arctozolt) {
                    this.teams.set(i, new arctozolt());
                } else if (temp instanceof articuno) {
                    this.teams.set(i, new articuno());
                } else if (temp instanceof blastoise) {
                    this.teams.set(i, new blastoise());
                } else if (temp instanceof braviary) {
                    this.teams.set(i, new braviary());
                } else if (temp instanceof pika) {
                    this.teams.set(i, new pika());
                }
            }
            // Update Visual
            if (teams.size() == 3) {
                for (int i = 0; i < 3; i++) {
                    Pokemon temp = teams.get(i);
                    if (temp instanceof arctozolt) {
                        Arctozolt.setVisible(false);
                    } else if (temp instanceof articuno) {
                        Articuno.setVisible(false);
                    } else if (temp instanceof blastoise) {
                        Blastoise.setVisible(false);
                    } else if (temp instanceof braviary) {
                        Braviary.setVisible(false);
                    } else if (temp instanceof pika) {
                        Pikachu.setVisible(false);
                    }

                    // Team
                    if (i == 0) {
                        Poke1.setIcon(temp.getGambar());
                        poke[0] = true;
                    } else if (i == 1) {
                        Poke2.setIcon(temp.getGambar());
                        poke[1] = true;
                    } else if (i == 2) {
                        Poke3.setIcon(temp.getGambar());
                        poke[2] = true;
                    }
                }
            }
            JOptionPane.showMessageDialog(this, "Sukses Load Data!");
        }
    }//GEN-LAST:event_LoadActionPerformed

    public static int getIndex() {
        for (int i = 0; i < 3; i++) {
            if (poke[i] == false) {
                return i;
            }
        }
        return -1;
    }

    private void BraviaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BraviaryActionPerformed
        // TODO add your handling code here:
        Sound.chsp();
        ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/braviary.png"));

        int btn = getIndex();
        if (btn != -1) {
            if (btn == 0) {
                // Poke1
                Poke1.setIcon(icon);
            } else if (btn == 1) {
                // Poke2
                Poke2.setIcon(icon);
            } else if (btn == 2) {
                // Poke3
                Poke3.setIcon(icon);
            }
            teams.set(btn, new braviary());
            poke[btn] = true;
            Braviary.setVisible(false);
        }
    }//GEN-LAST:event_BraviaryActionPerformed

    private void ArticunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArticunoActionPerformed
        // TODO add your handling code here:
        Sound.chsp();
        ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/articuno.png"));

        int btn = getIndex();
        if (btn != -1) {
            if (btn == 0) {
                // Poke1
                Poke1.setIcon(icon);
            } else if (btn == 1) {
                // Poke2
                Poke2.setIcon(icon);
            } else if (btn == 2) {
                // Poke3
                Poke3.setIcon(icon);
            }
            teams.set(btn, new articuno());
            poke[btn] = true;
            Articuno.setVisible(false);
        }
    }//GEN-LAST:event_ArticunoActionPerformed

    private void BlastoiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlastoiseActionPerformed
        // TODO add your handling code here:
        Sound.chsp();
        ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/blastoise-gmax.png"));

        int btn = getIndex();
        if (btn != -1) {
            if (btn == 0) {
                // Poke1
                Poke1.setIcon(icon);
            } else if (btn == 1) {
                // Poke2
                Poke2.setIcon(icon);
            } else if (btn == 2) {
                // Poke3
                Poke3.setIcon(icon);
            }
            teams.set(btn, new blastoise());
            poke[btn] = true;
            Blastoise.setVisible(false);
        }
    }//GEN-LAST:event_BlastoiseActionPerformed

    private void PikachuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PikachuActionPerformed
        // TODO add your handling code here:
        Sound.chsp();
        ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/pikachu.png"));

        int btn = getIndex();
        if (btn != -1) {
            if (btn == 0) {
                // Poke1
                Poke1.setIcon(icon);
            } else if (btn == 1) {
                // Poke2
                Poke2.setIcon(icon);
            } else if (btn == 2) {
                // Poke3
                Poke3.setIcon(icon);
            }
            teams.set(btn, new pika());
            poke[btn] = true;
            Pikachu.setVisible(false);
        }
    }//GEN-LAST:event_PikachuActionPerformed

    private void ArctozoltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArctozoltActionPerformed
        // TODO add your handling code here:
        Sound.chsp();
        ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/arctozolt.png"));

        int btn = getIndex();
        if (btn != -1) {
            if (btn == 0) {
                // Poke1
                Poke1.setIcon(icon);
            } else if (btn == 1) {
                // Poke2
                Poke2.setIcon(icon);
            } else if (btn == 2) {
                // Poke3
                Poke3.setIcon(icon);
            }
            teams.set(btn, new arctozolt());
            poke[btn] = true;
            Arctozolt.setVisible(false);
        }
    }//GEN-LAST:event_ArctozoltActionPerformed

    private void Poke1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Poke1ActionPerformed
        // TODO add your handling code here:
        Sound.soundbutton();
        Poke1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Icon/Pokeball.png")));
        poke[0] = false;

        Pokemon temp = teams.get(0);
        if (temp instanceof arctozolt) {
            Arctozolt.setVisible(true);
        } else if (temp instanceof articuno) {
            Articuno.setVisible(true);
        } else if (temp instanceof blastoise) {
            Blastoise.setVisible(true);
        } else if (temp instanceof braviary) {
            Braviary.setVisible(true);
        } else if (temp instanceof pika) {
            Pikachu.setVisible(true);
        }

        teams.set(0, null);
    }//GEN-LAST:event_Poke1ActionPerformed

    private void Poke2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Poke2ActionPerformed
        // TODO add your handling code here:
        Sound.soundbutton();
        Poke2.setIcon(new javax.swing.ImageIcon(getClass().getResource("Icon/Pokeball.png")));
        poke[1] = false;

        Pokemon temp = teams.get(1);
        if (temp instanceof arctozolt) {
            Arctozolt.setVisible(true);
        } else if (temp instanceof articuno) {
            Articuno.setVisible(true);
        } else if (temp instanceof blastoise) {
            Blastoise.setVisible(true);
        } else if (temp instanceof braviary) {
            Braviary.setVisible(true);
        } else if (temp instanceof pika) {
            Pikachu.setVisible(true);
        }

        teams.set(1, null);
    }//GEN-LAST:event_Poke2ActionPerformed

    private void Poke3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Poke3ActionPerformed
        // TODO add your handling code here:
        Sound.soundbutton();
        Poke3.setIcon(new javax.swing.ImageIcon(getClass().getResource("Icon/Pokeball.png")));
        poke[2] = false;

        Pokemon temp = teams.get(2);
        if (temp instanceof arctozolt) {
            Arctozolt.setVisible(true);
        } else if (temp instanceof articuno) {
            Articuno.setVisible(true);
        } else if (temp instanceof blastoise) {
            Blastoise.setVisible(true);
        } else if (temp instanceof braviary) {
            Braviary.setVisible(true);
        } else if (temp instanceof pika) {
            Pikachu.setVisible(true);
        }

        teams.set(2, null);
    }//GEN-LAST:event_Poke3ActionPerformed

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
