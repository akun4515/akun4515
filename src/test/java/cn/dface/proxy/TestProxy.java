/**
 * Project: myApp
 * 
 * File Created at 2017年3月10日
 * $Id$
 * 
 * Copyright 2015 dface.cn Croporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * dface Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with www.dface.cn
 */
package cn.dface.proxy;

/**
 * TODO Comment of TestProxy
 * @author akun
 *
 */
public class TestProxy {
    
    public static void main(String[] args) {
        BookFacadeProxy proxy = new BookFacadeProxy();  
        BookFacade bookProxy = (BookFacade) proxy.bind(new BookFacadeImpl());  
        bookProxy.addBook();  
    }
}
