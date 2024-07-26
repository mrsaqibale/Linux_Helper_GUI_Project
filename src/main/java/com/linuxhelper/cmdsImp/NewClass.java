/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.linuxhelper.cmdsImp;

import com.linuxhelper.cmds.SearchData;
import java.util.ArrayList;

/**
 *
 * @author mrsaqibale
 */
public class NewClass implements SearchData {
    
    
    ArrayList<String> fileNames = new ArrayList<>();
    
    
    public String getSearchByKey(String searchKey){
        System.out.println("Hello");
    }
    
    public String getFileAdress(String searchAdress){
        System.out.println("hello");
    }
}
