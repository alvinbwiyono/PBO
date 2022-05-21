
import java.io.Serializable;
import java.util.Random;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public abstract class Pokemon implements Serializable, Cloneable,Ulti{
    protected int maxHealth,currHealth,damage;
    protected ImageIcon gambar;
    protected String nama;

    public Pokemon(int maxHealth, int damage, String nama) {
        this.maxHealth = maxHealth;
        this.currHealth = maxHealth;
        this.damage = damage;
        this.nama=nama;
    }

    public Pokemon() {
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrHealth() {
        return currHealth;
    }

    public void setCurrHealth(int currHealth) {
        this.currHealth = currHealth;
    }

    public int getDamage() {
        return damage;
    }
    
    public abstract void skill();

    public int Attack(){
        Random rand=new Random();
        return rand.nextInt(damage)+1;
    }

    public ImageIcon getGambar() {
        return gambar;
    }

    public void setGambar(ImageIcon gambar) {
        this.gambar = gambar;
    }

    public boolean cekdarah(){
        if(currHealth<maxHealth-((maxHealth*50)/100)){
            return true;
        }else{
            return false;
        }
    }
    
    public String getNama() {
        return nama;
    }
    
    @Override
    protected Pokemon clone() throws CloneNotSupportedException {
        return (Pokemon)super.clone();  
    }

    @Override
    public abstract void ult();
    
    
}
