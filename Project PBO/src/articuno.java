
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
        
    public articuno(int maxHealth, int damage, ImageIcon gambar) {
        super(maxHealth, damage, gambar);
    }

    @Override
    public int skill() {
        return 0;
    }

    @Override
    public int ult() {
        return 0;
    }
        
        
   }
