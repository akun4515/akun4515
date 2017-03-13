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
package cn.dface.myApp.jSoup;

import cn.dface.myApp.bean.ShopVo;

/**
 * TODO Comment of Test
 * @author akun
 *
 */
public class Test {
    
    public static void main(String[] args) {
        
        
        ShopVo shopVo = new ShopVo();
        shopVo.getSid();
        shopVo.setName("脸脸");
        //shopVo.setSid(1);
        System.out.println(shopVo.toString());

    }
    
}
