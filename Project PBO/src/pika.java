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
        
    }
}
