package com.serviceImpl;

import com.dao.SysUserMapper;
import com.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.service.TestService;

@Service
public class TestServiceImpl implements TestService {

    public TestServiceImpl(){}

    @Autowired
    private SysUserMapper SysUserMapper;

    @Override
    public boolean pass() {
        return true;
    }

    @Override
    @Transactional
    public SysUser getUserById(Integer id) {
        SysUser user = new SysUser();
        if(id == 1){
         user = new SysUser(1,"hhy");
        }
        return user;
    }

    @Override
    @Transactional
    public int saveUser(SysUser sysUser) {
       return SysUserMapper.insert(sysUser);
    }
}
