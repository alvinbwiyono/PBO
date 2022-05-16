
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
        super(0,0);
        // 0,0 Sementara mek buat ga error ae
        gambar = new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/arctozolt.png"));
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
