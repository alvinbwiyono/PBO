/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fiko
 */
public class pika extends Pokemon implements Ulti{
    //MAGICAL (Skill)(Poisoned)
   
    public pika() {
        super(90, 2,"Pikachu");
        gambar = new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/pikachu.png"));
    }

    // 3 turn 100%
    @Override
    public void skill() {
        if(Battle.getTurn()==0){
            Battle.setAllypoison(Battle.getAllypoison()+3);
            Battle.setDmgpoison(0,this.damage*2);
        }else{
            Battle.setEnemypoison(Battle.getEnemypoison()+3);
            Battle.setDmgpoison(1,this.damage*2);
        }
    }
    
    // permanen poison 100% 15% enemy currhp
    @Override
    public void ult() {
        if(Battle.getTurn()==0){
            Battle.setAllypermapoison(1);
            Battle.setDmgpoison(0,this.damage*2);
            
            // Pengurangan 15% HP
            int x=(Battle.getMusuh().getCurrHealth()*15)/100;
            if(Battle.getEnemydmgreduc()==1){
                Battle.getMusuh().setCurrHealth(Battle.getMusuh().getCurrHealth()-(x/2));
            }else{
                Battle.getMusuh().setCurrHealth(Battle.getMusuh().getCurrHealth()-x);
            }
        }else{
            Battle.setEnemypermapoison(1);
            Battle.setDmgpoison(1,this.damage*2);
            
            // Pengurangan 15% HP
            int x=(Battle.getTim().getCurrHealth()*15)/100;
            if(Battle.getAllydmgreduc()==1){
                Battle.getTim().setCurrHealth(Battle.getTim().getCurrHealth()-(x/2));
            }else{
                Battle.getTim().setCurrHealth(Battle.getTim().getCurrHealth()-x);
            }
        }
    }
}
