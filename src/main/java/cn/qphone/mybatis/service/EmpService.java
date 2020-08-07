package cn.qphone.mybatis.service;

import cn.qphone.mybatis.pojo.Emp;

import java.util.List;

public interface EmpService {
    public List<Emp> findEmpList();

    public Emp get(Integer id);
    public void insert(Emp emp) ;

    public void update(Emp emp) ;

    public void delete(Integer id);
    void trans(Emp chen, Emp lee, double v);
}
