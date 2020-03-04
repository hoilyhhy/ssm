package com.serviceImpl;

import com.dao.SysUserMapper;
import com.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.service.TestService;

@Service
@Transactional
public class TestServiceImpl implements TestService {

    public TestServiceImpl(){}

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public boolean pass() {
        return true;
    }

    @Override
    public SysUser getUserById(Integer id) {
        SysUser user = new SysUser();
        if(id == 1){
         user = new SysUser(1,"hhy");
        }
        return user;
    }

    @Override
    public int saveUser(SysUser sysUser) {
       return sysUserMapper.insert(sysUser);
    }
}
