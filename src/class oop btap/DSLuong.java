package gui;

import java.util.*;
/**
 *
 * @author huyle
 */
public class DSLuong {
    private ArrayList<Luong> dsLuong;

    public DSLuong(){
        this.dsLuong = new ArrayList<>();
    }

    public ArrayList<Luong> getDSLuong(){
        return dsLuong;
    }

    public void addLuong(Luong luong){
        dsLuong.add(luong);
    }

    public void removeLuong(Luong luong){
        dsLuong.remove(luong);
    }
}
