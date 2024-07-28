
package com.linuxhelper.offlineCmds;
import java.util.List;

/**
 *
 * @author mrsaqibale
 */
public interface MdOfflineCmds {
    
    
    List<String> ShowAllCmds();
    
    List<String> SearchCmdByKey(String key);
    
    String SearchFileByCmd(String cmd);
    
    
}
