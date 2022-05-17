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
        super(90, 2);
        gambar = new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/pikachu.png"));
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
