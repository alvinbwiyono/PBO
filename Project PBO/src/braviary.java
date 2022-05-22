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
   
    public braviary() {
        super(90, 6,"Braviary");
        gambar = new javax.swing.ImageIcon(getClass().getResource("/pokemon_kita/braviary.png"));
    }
    // 15% enemy currhp
    @Override
    public void skill() {
        if(Battle.getTurn()==0){
            int x=(Battle.getMusuh().getCurrHealth()*15)/100;
            if(Battle.getEnemydmgreduc()==1){
                Battle.getMusuh().setCurrHealth(Battle.getMusuh().getCurrHealth()-(x/2));
            }else{
                Battle.getMusuh().setCurrHealth(Battle.getMusuh().getCurrHealth()-x);
            }
        }else{
            int x=(Battle.getTim().getCurrHealth()*15)/100;
            if(Battle.getAllydmgreduc()==1){
                Battle.getTim().setCurrHealth(Battle.getTim().getCurrHealth()-(x/2));
            }else{
                Battle.getTim().setCurrHealth(Battle.getTim().getCurrHealth()-x);
            }
        }
    }
    // 30% enemy currhp
    @Override
    public void ult() {
        if(Battle.getTurn()==0){
            int x=(Battle.getMusuh().getCurrHealth()*30)/100;
            if(Battle.getEnemydmgreduc()==1){
                Battle.getMusuh().setCurrHealth(Battle.getMusuh().getCurrHealth()-(x/2));
            }else{
                Battle.getMusuh().setCurrHealth(Battle.getMusuh().getCurrHealth()-x);
            }
        }else{
            int x=(Battle.getTim().getCurrHealth()*30)/100;
            if(Battle.getAllydmgreduc()==1){
                Battle.getTim().setCurrHealth(Battle.getTim().getCurrHealth()-(x/2));
            }else{
                Battle.getTim().setCurrHealth(Battle.getTim().getCurrHealth()-x);
            }
        }    
    }
    
}
