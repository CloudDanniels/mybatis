package cn.qphone.mybatis.service.impl;

import cn.qphone.mybatis.mapper.EmpMapper;
import cn.qphone.mybatis.pojo.Emp;
import cn.qphone.mybatis.service.EmpService;
import cn.qphone.mybatis.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmpServiceImpl implements EmpService {
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

}