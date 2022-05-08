
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public abstract class Pokemon{
    protected int maxHealth,currHealth,damage;

    public Pokemon(int maxHealth, int damage) {
        this.maxHealth = maxHealth;
        this.currHealth = maxHealth;
        this.damage = damage;
    }
    
    public abstract int skill();

    public int Attack(){
        Random rand=new Random();
        return rand.nextInt(damage)+1;
    }
    
}
