/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import java.sql.*;
import javax.swing.JTextField;

/**
 *
 * @author sys-user
 */
public class Logic {

    Connection a;
    PreparedStatement b;
    ResultSet c;

    public Logic() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            a = DriverManager.getConnection("jdbc:mysql://localhost/logics", "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean reg(String Name, String age, String mail, String phone, String address) {

        try {
            b = a.prepareStatement("insert into reg(Name,age,mail,phone,address) values(?,?,?,?,?)");
            b.setString(1, Name);
            b.setString(2, age);
            b.setString(3, mail);
            b.setString(4, phone);
            b.setString(5, address);

            int res = b.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public boolean logic(String name, String pass) {
        try {
            b = a.prepareStatement("select * from logic where Name=? and Password=?");
            b.setString(1, name);
            b.setString(2, pass);
            c = b.executeQuery();
            if (c.next()) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public boolean customerss(String Name, int Persons, int Days, String from, String to, int NoofRooms, String Roomno, String Roomtype, int total, int cid) {

        try {
            b = a.prepareStatement("insert into customerss(Name,Persons,Days,FromD,ToD,NoofRooms,Roomno,Roomtype,total,cid) values(?,?,?,?,?,?,?,?,?,?)");
            b.setString(1, Name);
            b.setInt(2, Persons);
            b.setInt(3, Days);
            b.setString(4, from);
            b.setString(5, to);
            b.setInt(6, NoofRooms);
            b.setString(7, Roomno);
            b.setString(8, Roomtype);
            b.setInt(9, total);
            b.setInt(10, cid);
            int res = b.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public ResultSet vacant() {
        try {
            b = a.prepareStatement("select * from vacant1");
            c = b.executeQuery();

        } catch (Exception e) {
        }
        return c;
    }

    public ResultSet customer() {
        try {
            b = a.prepareStatement("select * from customer");
            c = b.executeQuery();

        } catch (Exception e) {
        }
        return c;
    }

    public ResultSet reg() {
        try {
            b = a.prepareStatement("select * from reg");
            c = b.executeQuery();

        } catch (Exception e) {
        }
        return c;
    }
//     public ResultSet engaged()
//     {
//         try
//         {
//             b=a.prepareStatement("select * from engaged3");
//             c=b.executeQuery();
//            
//         }
//         catch(Exception e)
//         {
//         }
//         return c;

    public ResultSet Total(String Name) {
        try {
            b = a.prepareStatement("select * from customerss where Name=?");
            b.setString(1, Name);
            c = b.executeQuery();

        } catch (Exception e) {
        }
        return c;
    }

    public ResultSet detail(String name) {
        try {
            b = a.prepareStatement("select * from  reg where name=?");
            b.setString(1, name);
            c = b.executeQuery();

        } catch (Exception e) {
        }
        return c;
    }

    public ResultSet customess() {
        try {
            b = a.prepareStatement("select * from customerss");
            c = b.executeQuery();

        } catch (Exception e) {
        }
        return c;
    }

    public ResultSet Totall(String name) {
        try {
            b = a.prepareStatement("select * from customerss where Name=?");
            b.setString(1, name);
            c = b.executeQuery();

        } catch (Exception e) {
        }
        return c;
    }

    public boolean eng(int roomNo, String from,String to) {
        try {
            b = a.prepareStatement("select RoomNo,FromD,ToD from customerss where fromD ='"+from+"' and ToD='"+to+"'");
           
           
            c = b.executeQuery();
            
            while (c.next()) {
                System.out.print(c.getInt("RoomNo"));
                if (c.getInt("RoomNo") == roomNo && (c.getString("FromD").equals(from)||c.getString("ToD").equals(to)) ){
                    
                    return false;
                }
            }

        } catch (Exception e) {
        }
        return true;
    }

    public boolean engaged(String from, String to, String Roomno, String Roomtype) {

        try {
            b = a.prepareStatement("insert into customerss(Roomno,Roomtype,Check_in,Check_out) values(?,?,?,?)");
            b.setString(7, Roomno);
            b.setString(8, Roomtype);
            b.setString(3, from);
            b.setString(4, to);

            int res = b.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public ResultSet engaged() {
        try {
            b = a.prepareStatement("select * from customerss");
            c = b.executeQuery();

        } catch (Exception e) {
        }
        return c;
    }

    public boolean remove(String Name) {

        try {
            b = a.prepareStatement("delete from customerss where Name=?");
            b.setString(1, Name);
            int res = b.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    public ResultSet sel(int cid) {
        try {
            b = a.prepareStatement("select name from reg where cid=?");
            b.setInt(1,cid);
            c = b.executeQuery();

        } catch (Exception e) {
        }
        return c;
    }
     public boolean cusId(int cid,String Name, String mail, String phone) {

        try {
            b = a.prepareStatement("insert into reg(cid,Name,mail,phone) values(?,?,?,?)");
            b.setInt(1, cid);
            b.setString(2, Name);
            b.setString(3, mail);
            b.setString(4, phone);

            int res = b.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
}
     
      public ResultSet cusId() {
        try {
            b = a.prepareStatement("select * from reg");
            c = b.executeQuery();

        } catch (Exception e) {
        }
        return c;
    }
       public ResultSet details() {
        try {
            b = a.prepareStatement("select * from roomdetails");
            c = b.executeQuery();

        } catch (Exception e) {
        }
        return c;
}
       public ResultSet datee(String out) {
        try {
            b = a.prepareStatement("select * from customerss where FromD=?");
            b.setString(1, out);
            c = b.executeQuery();

        } catch (Exception e) {
        }
        return c;
    }
       
}
