package com.example.springdemo1.service;

import com.example.springdemo1.entity.TAdmin;

import java.util.List;


/**
* @author 亲爱的政霸霸
* @description 针对表【t_admin】的数据库操作Service
* @createDate 2022-08-24 11:12:02
 * bollean zai service
*/
public interface TAdminService  {
List<TAdmin> getUser();
    List<TAdmin> TadmingetUserByName(String name,String sex);
   /* boolean addUser(TAdmin admin);*/
    boolean addUsername(TAdmin tAdmin);
    boolean updateUser(TAdmin tAdmin);
}
