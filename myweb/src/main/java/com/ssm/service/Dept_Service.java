package com.ssm.service;

import com.ssm.dao.Dept_Dao;
import com.ssm.pojo.Dept_Pojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Dept_Service {
    @Autowired
    private Dept_Dao dept_dao;

    public Dept_Pojo add_test(Integer deptno){
        Dept_Pojo dept_pojo=dept_dao.FindByNo(deptno);
        return dept_pojo;
    }
}
