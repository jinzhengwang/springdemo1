package com.example.springdemo1.mapper;

import com.example.springdemo1.entity.TAdmin;
import org.springframework.stereotype.Component;

import java.util.List;


/**
* @author 亲爱的政霸霸
* @description 针对表【t_admin】的数据库操作Mapper
* @createDate 2022-08-24 11:12:02
* @Entity com.example.springdemo1.entity.TAdmin
*/
@Component
public interface TAdminMapper  {

List<TAdmin> getAllUser();
List<TAdmin> getUserByName(String name,String sex);
/*int insterUser(TAdmin admin);*/
int addusername(TAdmin tAdmin);
int updateUser(TAdmin tAdmin);
}
