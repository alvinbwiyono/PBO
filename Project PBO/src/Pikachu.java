
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fiko
 */
public class Pikachu extends Pokemon implements Ulti{
    //MAGICAL (Skill)(Poitioned)
    public Pikachu(ImageIcon gambar) {
        super(90, 2, gambar);
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
