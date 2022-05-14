
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aldiaafn
 */
public class blastoise extends Pokemon implements Ulti{
    //BUFFER
    public blastoise(ImageIcon gambar) {
        super(120, 3, gambar);
    }

    public blastoise() {
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
