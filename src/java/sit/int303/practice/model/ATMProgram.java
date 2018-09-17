/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.practice.model;

/**
 *
 * @author Nuntuch Thongyoo
 */
public class ATMProgram {
    private double  money;
    private String  program;
    private String  oper;

    
    
    


    
    
    public ATMProgram(double money, String program, String oper) {
        this.money = money;
        this.program = program;
        this.oper = oper;
    }
    
    
    
    
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }
    
    
}
