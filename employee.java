/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class employee {

    private int phone;
    private int Name;
    private int ID;
    private String Password;

    public int getPhone() {
        return phone;
    }

    public int getName() {
        return Name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setName(int Name) {
        this.Name = Name;
    }

    public employee(int phone, int Name, int ID, String Password) {
        this.phone = phone;
        this.Name = Name;
        this.ID = ID;
        this.Password = Password;
    }

    public employee() {

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "employee{" + "ID=" + ID + ", Password=" + Password + '}';
    }}
//
//    public boolean checkemployee(int Id, String password) {
//
//        Connection conn = getconnection();
//        try {
//            String sql = "SELECT * FROM employee WHERE Id='" + Id + "' AND password='" + password + "'";
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            ResultSet rs = stmt.executeQuery();
//
//            if (rs.next()) {
//                System.out.println("Submitted correctly!");
//
//                new employee().setVisible(true);
//                // JOptionPane.showMessageDialog(null, "Welcom Back Admin");
//                return true;
//            } else {
//                JOptionPane.showMessageDialog(null, "Incorrect password or Id");
//
//            }
//            stmt.close();
//            conn.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//
//        }
//        return false;
//    }
//
////    public void createAccount(employee employee) {
////        throw new UnsupportedOperationException("Not supported yet.");
////    }
//
//    public void createAccount(employee employee) {
//        Connection conn = getconnection();
//        try {
//            String sql = "INSERT into Id,password) VALUES (null?,?)";
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            stmt.setString(1, employee.getId());
//            stmt.setString(2, employee.getPassword());
//            stmt.execute();
//            System.out.println("aded correctly!");
//            conn.close();
//        } catch (SQLException ex) {
//            System.out.println("could not added");
//            ex.printStackTrace();
//        }
//
//    }}
