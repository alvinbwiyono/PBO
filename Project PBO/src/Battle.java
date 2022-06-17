
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

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
    private static ArrayList<Pokemon> musuh=new ArrayList<>();
    private static ArrayList<Pokemon> tim=new ArrayList<>();
    private static int jmlultially,jmlultienemy;    
    private static int cooldownbutton,cooldownenemy;
    private static int turn;
    private static int enemystun,allystun;
    private static int allypoison,enemypoison;
    private static int enemypermapoison,allypermapoison;
    private static int allydmgreduc;
    private static int enemydmgreduc;
    private static int dmgpoison[];
    private int currallyult;
    private int currenemyult;
    private Timer t=null;
    public Battle() {
        initComponents();
        this.setTitle("Battle Pokemon");
        this.setSize(813,535);
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        ImageIcon img = new ImageIcon("src/Icon/Pokeball.png");
        this.setIconImage(img.getImage());
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
        
        Icon icon = new javax.swing.ImageIcon(getClass().getResource("Background/bg7.jpg"));;
        if(Arena.pilArena==2){
            icon = new javax.swing.ImageIcon(getClass().getResource("Background/bg5.jpg"));
        }else if(Arena.pilArena==3){
            icon = new javax.swing.ImageIcon(getClass().getResource("Background/bg9.jpg"));
        }
        
        // Reset data
        jmlultially=3;
        jmlultienemy=3;
        cooldownbutton=0;
        cooldownenemy=0;
        turn=0;
        enemystun=0;
        allystun=0;
        allypoison=0;
        enemypoison=0;
        enemypermapoison=0;
        allypermapoison=0;
        allydmgreduc=0;
        enemydmgreduc=0;
        dmgpoison=new int[2];
        currallyult=0;
        currenemyult=0;
        
        arena.setIcon(icon);
        tim.clear();
        
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
                if(tambah.getMaxHealth()==musuh.get(i).getMaxHealth()&&
                   tambah.getDamage()==musuh.get(i).getDamage()){
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
        AllyHealth.setMaximum(tim.get(0).getMaxHealth());
        AllyHealth.setValue(tim.get(0).getCurrHealth());
        EnemyHealth.setMaximum(musuh.get(0).getMaxHealth());
        EnemyHealth.setValue(musuh.get(0).getCurrHealth());
        ally.setIcon(tim.get(0).getGambar());
        enemy.setIcon(musuh.get(0).getGambar());
        
        // Timer untuk Stun
        t = new Timer(1000,new ActionListener(){
            public void actionPerformed(ActionEvent event){
                    atk.setEnabled(false);
                    skil.setEnabled(false);
                    ult.setEnabled(false);
                    gerakmusuh();
                    updatehealth();
                    cekmenang();
                    allystun--;
                    if(allystun==0){
                        t.stop();
                        atk.setEnabled(true);
                        cekbutton();
                    }
                }
            });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        atk = new javax.swing.JButton();
        ult = new javax.swing.JButton();
        skil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        enemy = new javax.swing.JLabel();
        ally = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        EnemyHealth = new javax.swing.JProgressBar();
        AllyHealth = new javax.swing.JProgressBar();
        arena = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ATTACK");
        jLabel2.setFocusable(false);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 50, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("SKILL");
        jLabel3.setFocusable(false);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 40, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ULTI");
        jLabel4.setFocusable(false);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 40, 30));

        atk.setBackground(new java.awt.Color(255, 0, 51));
        atk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        atk.setForeground(new java.awt.Color(255, 255, 255));
        atk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/battle.png"))); // NOI18N
        atk.setBorder(null);
        atk.setBorderPainted(false);
        atk.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/close.png"))); // NOI18N
        atk.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/close.png"))); // NOI18N
        atk.setFocusable(false);
        atk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atkActionPerformed(evt);
            }
        });
        getContentPane().add(atk, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 390, 50, 80));

        ult.setBackground(new java.awt.Color(255, 255, 0));
        ult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ult.setForeground(new java.awt.Color(0, 0, 0));
        ult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/death.png"))); // NOI18N
        ult.setBorder(null);
        ult.setBorderPainted(false);
        ult.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/close.png"))); // NOI18N
        ult.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/close.png"))); // NOI18N
        ult.setEnabled(false);
        ult.setFocusable(false);
        ult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultActionPerformed(evt);
            }
        });
        getContentPane().add(ult, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 50, 80));

        skil.setBackground(new java.awt.Color(102, 204, 0));
        skil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        skil.setForeground(new java.awt.Color(255, 255, 255));
        skil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lighting.png"))); // NOI18N
        skil.setBorder(null);
        skil.setBorderPainted(false);
        skil.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/close.png"))); // NOI18N
        skil.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/close.png"))); // NOI18N
        skil.setFocusable(false);
        skil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skilActionPerformed(evt);
            }
        });
        getContentPane().add(skil, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 390, 52, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bgbutton.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 200, 180));
        getContentPane().add(enemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 180, 100));
        getContentPane().add(ally, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 200, 100));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        EnemyHealth.setForeground(new java.awt.Color(255, 51, 51));
        EnemyHealth.setToolTipText("");
        EnemyHealth.setValue(100);
        EnemyHealth.setStringPainted(true);
        getContentPane().add(EnemyHealth, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, -1, 20));

        AllyHealth.setForeground(new java.awt.Color(255, 51, 51));
        AllyHealth.setToolTipText("");
        AllyHealth.setValue(100);
        AllyHealth.setStringPainted(true);
        getContentPane().add(AllyHealth, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 20));

        arena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/bg5.jpg"))); // NOI18N
        getContentPane().add(arena, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Update Health di Layar
    private static void updatehealth(){
        try{
            AllyHealth.setValue(tim.get(0).getCurrHealth());
            EnemyHealth.setValue(musuh.get(0).getCurrHealth());
        }catch (IndexOutOfBoundsException ex) {
            
        }
        
    }
    // Exit
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Sound.soundbutton();
        Menu next=new Menu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Basic Attack
    private void atkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atkActionPerformed

        // TODO add your handling code here:
        Sound.attack();
        
        musuh.get(0).setCurrHealth(musuh.get(0).getCurrHealth()-tim.get(0).getDamage());
        turn++;
        
        updatehealth();
        cekmenang();

        if(enemystun==0){
            gerakmusuh();
        }
        
        cekstun();
        turn--;
        
        cekpoison();
        updatehealth();
        
        cekmenang();
        cekbutton();
    }//GEN-LAST:event_atkActionPerformed

    private void ultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultActionPerformed
        // TODO add your handling code here:
        Sound.ulti();
        String[] possibilities = new String[tim.size()];
        for (int i = 0; i < tim.size(); i++) {
            possibilities[i]=tim.get(i).getNama();
        }
        // Pop Up Pilih Ult
        String s = (String)JOptionPane.showInputDialog(
                    this,
                    "Select Pokemon",
                    "Customized Dialog",
                    JOptionPane.PLAIN_MESSAGE,
                    new ImageIcon("src/Icon/pokeball.png"),
                    possibilities,
                    tim.get(0).getNama());
        try{
            if(s.equals(tim.get(0).getNama())){
                tim.get(0).ult();
                jmlultially--;
                ult.setEnabled(false);
            }else if(s.equals(tim.get(1).getNama())){
                tim.get(1).ult();
                jmlultially--;
                ult.setEnabled(false);
            }else if(s.equals(tim.get(2).getNama())){
                tim.get(2).ult();
                jmlultially--;
                ult.setEnabled(false);
            }
            currallyult++;
            turn++;
            updatehealth();
            cekmenang();
            
            if(enemystun==0){
                gerakmusuh();
            }
            
            cekstun();
            turn--;
            cekpoison();
            updatehealth();
            cekmenang();
            cekbutton();
            
        } catch (NullPointerException ex){
            
        }
    }//GEN-LAST:event_ultActionPerformed
    
    private void skilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skilActionPerformed
        // TODO add your handling code here:
        Sound.skl();
        tim.get(0).skill();
        cooldownbutton=5;
        skil.setEnabled(false);
        turn++;
        updatehealth();
        cekmenang();
        if(enemystun==0){
            gerakmusuh();
        }
        cekstun();
        turn--;
        cekpoison();
        updatehealth();
        cekmenang();
        cekbutton();
    }//GEN-LAST:event_skilActionPerformed
    
    private static void cekpoison(){
        if(allypoison>0){
            if(enemydmgreduc==1){
                musuh.get(0).setCurrHealth(musuh.get(0).getCurrHealth()-dmgpoison[0]/2);
            }else{
                musuh.get(0).setCurrHealth(musuh.get(0).getCurrHealth()-dmgpoison[0]);
            }
            allypoison--;
        }
        if(allypermapoison==1){
            if(enemydmgreduc==1){
                musuh.get(0).setCurrHealth(musuh.get(0).getCurrHealth()-dmgpoison[0]/2);
            }else{
                musuh.get(0).setCurrHealth(musuh.get(0).getCurrHealth()-dmgpoison[0]);
            }
        }
        if(enemypoison>0){
            if(allydmgreduc==1){
                tim.get(0).setCurrHealth(tim.get(0).getCurrHealth()-dmgpoison[1]/2);
            }else{
                tim.get(0).setCurrHealth(tim.get(0).getCurrHealth()-dmgpoison[1]);
            }
            enemypoison--;
        }
        if(enemypermapoison==1){
            if(allydmgreduc==1){
                tim.get(0).setCurrHealth(tim.get(0).getCurrHealth()-dmgpoison[1]/2);
            }else{
                tim.get(0).setCurrHealth(tim.get(0).getCurrHealth()-dmgpoison[1]);
            }
        }
    }
    
    private void gerakmusuh(){
        Random rand=new Random();
        int pil=rand.nextInt(3);
        if(pil==2&&jmlultienemy>0&&musuh.get(0).cekdarah()&&currenemyult==0){
            jmlultienemy--;
            int idx=rand.nextInt(musuh.size());
            musuh.get(idx).ult();
            currenemyult++;
        }else if(pil==2){
            pil--;
        }
        
        try {
            if(pil==1&&cooldownenemy==0){
                musuh.get(0).skill();
                cooldownenemy=5;
            }else if(pil==1){
                pil--;
            }
            if(pil==0){
                tim.get(0).setCurrHealth(tim.get(0).getCurrHealth()-musuh.get(0).getDamage());
            }
        } catch (IndexOutOfBoundsException ex){
            
        }
    }
    
    public void updatepokemon(){
        AllyHealth.setMaximum(tim.get(0).getMaxHealth());
        AllyHealth.setValue(tim.get(0).getCurrHealth());
        EnemyHealth.setMaximum(musuh.get(0).getMaxHealth());
        EnemyHealth.setValue(musuh.get(0).getCurrHealth());
        ally.setIcon(tim.get(0).getGambar());
        enemy.setIcon(musuh.get(0).getGambar());
    }
    
    private void cekmenang(){
        if(tim.get(0).getCurrHealth()<=0){
            tim.remove(0);
            enemypermapoison=0;
            allydmgreduc=0;
            currallyult=0;
            if(tim.size()==0){
                Sound.lose();
                JOptionPane.showMessageDialog(this, "You Lose");
                Menu next=new Menu();
                next.setVisible(true);
                dispose();
            }else{
                updatepokemon();
            }
        }
        try{
            if(musuh.get(0).getCurrHealth()<=0){
                musuh.remove(0);
                allypermapoison=0;
                enemydmgreduc=0;
                currenemyult=0;
                if(musuh.size()==0){
                    Sound.win();
                    JOptionPane.showMessageDialog(this, "You Win");
                    Menu next=new Menu();
                    next.setVisible(true);
                    dispose();
                }else{
                    updatepokemon();
                }
            }
        } catch (IndexOutOfBoundsException ex){
            
        }
        
    }
    
    
    private void cekbutton(){
        if(cooldownbutton==0){
            skil.setEnabled(true);
        }else{
            cooldownbutton--;
        }
        if(cooldownenemy>0){
            cooldownenemy--;
        }
        if(enemystun>0){
            enemystun--;
        }
        try{
            if(tim.get(0).cekdarah()&&jmlultially>0&&currallyult==0){
                ult.setEnabled(true);
            }else{
                ult.setEnabled(false);
            }
        } catch (IndexOutOfBoundsException ex){
            
        }
    }
    
    public void cekstun(){
        if(allystun>0) {
            t.start();
        }
    }

    public static void setEnemypermapoison(int enemypermapoison) {
        Battle.enemypermapoison = enemypermapoison;
    }

    public static void setAllypermapoison(int allypermapoison) {
        Battle.allypermapoison = allypermapoison;
    }

    public static int getAllydmgreduc() {
        return allydmgreduc;
    }

    public static void setAllydmgreduc(int allydmgreduc) {
        Battle.allydmgreduc = allydmgreduc;
    }

    public static int getEnemydmgreduc() {
        return enemydmgreduc;
    }

    public static void setEnemydmgreduc(int enemydmgreduc) {
        Battle.enemydmgreduc = enemydmgreduc;
    }

    public static void setDmgpoison(int idx,int dmg) {
        dmgpoison[idx]=dmg;
    }
   
    public static Pokemon getMusuh() {
        return musuh.get(0);
    }

    public static Pokemon getTim() {
        return tim.get(0);
    }
    
    public static int getTurn() {
        return turn;
    }

    public static int getEnemystun() {
        return enemystun;
    }

    public static void setEnemystun(int enemystun1) {
        enemystun = enemystun1;
    }

    public static int getAllystun() {
        return allystun;
    }

    public static void setAllystun(int allystun1) {
        allystun = allystun1;
    }

    public static int getAllypoison() {
        return allypoison;
    }

    public static void setAllypoison(int allypoison) {
        Battle.allypoison = allypoison;
    }

    public static int getEnemypoison() {
        return enemypoison;
    }

    public static void setEnemypoison(int enemypoison) {
        Battle.enemypoison = enemypoison;
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
    private static javax.swing.JProgressBar AllyHealth;
    private static javax.swing.JProgressBar EnemyHealth;
    private static javax.swing.JLabel ally;
    private javax.swing.JLabel arena;
    private javax.swing.JButton atk;
    private static javax.swing.JLabel enemy;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private static javax.swing.JButton skil;
    private static javax.swing.JButton ult;
    // End of variables declaration//GEN-END:variables
}
