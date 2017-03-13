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
package cn.dface.myApp.bean;

import java.io.Serializable;

import lombok.Data;

/**
 * TODO Comment of ShopVo
 * 
 * @author akun
 */
@Data
public class ShopVo implements Serializable {

    private static final long serialVersionUID = 8468430868002540613L;
    private Integer sid;
    private String  name;
    
    public Integer getSid(){
        return this.sid == null?0:sid;
    }
}
