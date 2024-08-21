/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.linuxhelper.offlineCmds.imp;

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
        data.put("a", "good1");
        data.put("b", "good1");
        data.put("c", "good1");
        data.put("d", "good1");
        data.put("e", "good1");
        data.put("f", "good1");
        data.put("g", "good1");
        data.put("h", "good1");
        data.put("i", "good1");
        data.put("j", "good1");
        data.put("k", "good1");
        data.put("l", "good1");
        data.put("m", "good1");
        data.put("n", "good1");
        data.put("o", "good1");
        data.put("p", "good1");
        data.put("q", "good1");
        data.put("r", "good1");
        data.put("s", "good1");
        data.put("t", "good1");
        data.put("u", "good1");
        data.put("v", "good1");
        data.put("w", "good1");
        data.put("x", "good1");
        data.put("y", "good1");
        data.put("z", "good1");
        data.put("z", "good1");
        data.put("z", "good1");
        data.put("ab", "good1");
        data.put("abc", "good1");
        data.put("abcd", "good1");
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
