package com.service;

import com.entity.SysUser;

public interface TestService {

    boolean pass();

    SysUser getUserById(Integer id);

    int saveUser(SysUser sysUser);
}
