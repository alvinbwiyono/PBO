
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aldiaafn
 */
public class arctozolt extends Pokemon implements Ulti{
   
    public arctozolt() {
        // Stun (Skill 2 Ulti 4)
        super(95,5,"Arctozolt");
        gambar = new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/arctozolt.png"));
    }

    @Override
    public void skill() {
        if(Battle.getTurn()==0){
            Battle.setEnemystun(Battle.getEnemystun()+2);
        }else{
            Battle.setAllystun(Battle.getAllystun()+2);
        }
    }

    @Override
    public void ult() {
        if(Battle.getTurn()==0){
            Battle.setEnemystun(Battle.getEnemystun()+4);
        }else{
            Battle.setAllystun(Battle.getAllystun()+4);
        }
    }
    
}
