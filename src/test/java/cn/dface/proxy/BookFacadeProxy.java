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

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * TODO Comment of BookFacadeProxy
 * @author akun
 *
 */
public class BookFacadeProxy implements InvocationHandler{
    
    private Object target;
    
    public Object bind(Object target){
        this.target = target;  
        
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
    
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;  
        System.out.println("事物开始");  
        //执行方法  
        result=method.invoke(target, args);  
        System.out.println("事物结束");  
        return result;  

    }

}
