
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aldiaafn
 */
    public class articuno extends Pokemon implements Ulti{
    //HEALER
   
    public articuno() {
        super(110, 2, "Articuno");
        gambar = new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/articuno.png"));
    }
    
    // dmg x5
    @Override
    public void skill() {
        if(Battle.getTurn()==0){
            Battle.getMusuh().setCurrHealth(Battle.getMusuh().getCurrHealth()-Battle.getTim().getDamage()*5);
        }else{
            Battle.getTim().setCurrHealth(Battle.getTim().getCurrHealth()-Battle.getMusuh().getDamage()*5);
        }
    }
    // + 50% current health
    @Override
    public void ult() {
        
    }
   
}
