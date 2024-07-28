/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.linuxhelper.offlineCmds.imp;

import com.linuxhelper.offlineCmds.MdOfflineCmds;
import com.linuxhelper.offlineCmds.MdOfflineCmds;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author mrsaqibale
 */
public class MdOfflineCmdsImp implements MdOfflineCmds {
    
    
    private HashMap<String, String> data = new HashMap<>();
    public MdOfflineCmdsImp(){
        data.put("hello1", "good1");
        data.put("hello2", "good2");
        data.put("hello3", "good3");
        data.put("hello4", "good4");
        data.put("hello5", "good5");
        data.put("line 6", "good5");

    }
    
    @Override
    public List<String> ShowAllCmds(){
        // get all the keys 
        List<String> getAllKeys = new ArrayList<>();
        getAllKeys.addAll(data.keySet());
        return getAllKeys;
    }
    
    
//    search data by the key 
    @Override
    public List<String> SearchCmdByKey(String key){
        List<String> getMatchedkey = new ArrayList<>();
        
        for( String sData : data.keySet()){
            if(sData.contains(key)){
                getMatchedkey.add(sData);
            }
        }
        return getMatchedkey;
    }
    
    @Override
    public String SearchFileByCmd(String cmd){
        return null;
    }
    
}
