package cn.qphone.mybatis.service.impl;

import cn.qphone.mybatis.mapper.EmpMapper;
import cn.qphone.mybatis.pojo.Emp;
import cn.qphone.mybatis.service.EmpService;
import cn.qphone.mybatis.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmpServiceImpl implements EmpService {

    // 自动通过mybatis底层的动态代理生成一个实现了EmpMapper接口的实现类的代理对象
    private SqlSession sqlSession = MyBatisUtils.getSqlSession();
    private EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);

    public List<Emp> findEmpList() {
        return empMapper.findEmpList();
    }

    public Emp get(Integer id) {
        return empMapper.get(id);
    }

    public void insert(Emp emp) {
        empMapper.insert(emp);
        sqlSession.commit();
    }

    public void update(Emp emp) {
        empMapper.update(emp);
        sqlSession.commit();
    }

    public void delete(Integer id) {
        empMapper.delete(id);
        sqlSession.commit();
    }

    public void trans(Emp chen, Emp lee, double v) {
        chen.setSalary(chen.getSalary() - v);
        lee.setSalary(lee.getSalary() + v);
        empMapper.update(chen);
        System.out.println(1/0);
        empMapper.update(lee);
    }
}