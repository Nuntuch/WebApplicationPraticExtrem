/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.first.model;

import sit.int303.first.obj.ProUser;

/**
 *
 * @author Nuntuch Thongyoo
 */
public class CheckUsers {

    private ProUser[] pua;
    private ProUser pu;

    public CheckUsers(ProUser pu) {
        this.pu = pu;
    }
    

    public boolean CheckUser() {
        pua[0] = (ProUser)pu;
        pua[1] = new ProUser(882018, "TTS", "Prayuth112");

        for (int i = 1; i < pua.length; i++) {
            if (pua[0].getId() == pua[i].getId()) {
                if (pua[0].getUsername().equals(pua[i].getUsername())) {
                    if (pua[0].getPassword().equals(pua[i].getPassword())) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public ProUser[] getPua() {
        return pua;
    }

    public void setPua(ProUser[] pua) {
        this.pua = pua;
    }

    public ProUser getPu() {
        return pu;
    }

    public void setPu(ProUser pu) {
        this.pu = pu;
    }

 
    
}
