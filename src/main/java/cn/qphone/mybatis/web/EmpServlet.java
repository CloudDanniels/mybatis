package cn.qphone.mybatis.web;

import cn.qphone.mybatis.pojo.Emp;
import cn.qphone.mybatis.service.EmpService;
import cn.qphone.mybatis.service.impl.EmpServiceImpl;

import java.util.List;

public class EmpServlet {
    private EmpService empService = new EmpServiceImpl();

    public List<Emp> findEmpList() {
        return empService.findEmpList();
    }

    public Emp get(Integer id) {
        return empService.get(id);
    }

    public void insert(Emp emp) {
        empService.insert(emp);
    }

    public void update(Emp emp) {
        empService.update(emp);
    }

    public void delete(Integer id) {
        empService.delete(id);
    }

}
