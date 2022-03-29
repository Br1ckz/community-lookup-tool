/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import communitylookuptool.PersonList;
import mvc.cntl.LoginCntl;
import mvc.cntl.ResultTableCntl;

/**
 *
 * @author bryce
 */
public class CommunityLookupTool {
    public static void main(String[] args) {
//        LoginCntl loginCntl = new LoginCntl();
//            ResultCntl resultCntl = new ResultCntl();
        ResultTable();    
    }
    
    public static void ResultTable() {
        PersonList personList = new PersonList();
        ResultTableCntl resultTableCntl = new ResultTableCntl(personList);
    }
}
