/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.linuxhelper.cmds;

import java.util.ArrayList;

/**
 *
 * @author mrsaqibale
 */
public interface SearchData {
    
    ArrayList<String> fileNames = new ArrayList<>();
    
    String getSearchByKey(String searchKey);
    
    String getFileAdress(String searchAdress);
}
