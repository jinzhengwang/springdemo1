package com.example.springdemo1.service.impl;


import com.example.springdemo1.entity.TAdmin;
import com.example.springdemo1.service.TAdminService;
import com.example.springdemo1.mapper.TAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 亲爱的政霸霸
* @description 针对表【t_admin】的数据库操作Service实现
* @createDate 2022-08-24 11:12:02
*/
@Service
public class TAdminServiceImpl
implements TAdminService{

    @Autowired
    private TAdminMapper tAdminMapper;
    @Override
    public List<TAdmin> getUser() {
        return tAdminMapper.getAllUser();
    }

    @Override
    public List<TAdmin> TadmingetUserByName(String name,String sex) {
        return tAdminMapper.getUserByName(name,sex);
    }

    @Override
    public boolean addUsername(TAdmin tAdmin) {
        return tAdminMapper.addusername(tAdmin)>0;
    }

    @Override
    public boolean updateUser(TAdmin tAdmin) {
        return tAdminMapper.updateUser(tAdmin)>0;
    }

    /*@Override
    public boolean addUser(TAdmin admin) {
        return tAdminMapper.insterUser(admin)>0;
    }*/
}
