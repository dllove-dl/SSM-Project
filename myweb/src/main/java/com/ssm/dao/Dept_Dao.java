package com.ssm.dao;

import com.ssm.pojo.Dept_Pojo;

public interface Dept_Dao {
    /**
     * @param deptno
     * @return Dept_Pojo
     */
    Dept_Pojo FindByNo(Integer deptno);
}
