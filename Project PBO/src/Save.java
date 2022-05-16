
import java.io.Serializable;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fiko
 */
public class Save implements Serializable{
    ArrayList<Pokemon> tim = new ArrayList<>();

    public Save(ArrayList<Pokemon> teams) {
        tim = teams;
    }

    public ArrayList<Pokemon> getTim() {
        return tim;
    }

    public void setTim(ArrayList<Pokemon> tim) {
        this.tim = tim;
    }
    
}
