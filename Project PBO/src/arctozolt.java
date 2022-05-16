
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
    
    public arctozolt(ImageIcon gambar) {
        super(0,0,gambar);
        // 0,0 Sementara mek buat ga error ae
    }

    public arctozolt() {
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
