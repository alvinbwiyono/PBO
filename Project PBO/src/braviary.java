
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aldiaafn
 */
public class braviary extends Pokemon implements Ulti{
    //ATTACKER (Basic attack)
    public braviary(ImageIcon gambar) {
        super(90, 6, gambar);
    }

    public braviary() {
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
