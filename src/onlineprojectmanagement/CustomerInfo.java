/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineprojectmanagement;

/**
 *
 * @author Lenovo
 */
public class CustomerInfo {
    private int customerid;
    private String password;

    public CustomerInfo(int customerid, String password) {
        this.customerid = customerid;
        this.password = password;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
