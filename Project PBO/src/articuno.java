
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
        super(110, 2);
        gambar = new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/articuno.png"));
    }
    
    // dmg x5
    @Override
    public int skill() {
        return 0;
    }
    // + 50% current health
    @Override
    public int ult() {
        return 0;
    }
        
        
   }
