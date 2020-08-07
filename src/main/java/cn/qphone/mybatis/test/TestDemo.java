package cn.qphone.mybatis.test;
import cn.qphone.mybatis.pojo.Emp;
import cn.qphone.mybatis.web.EmpServlet;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) {
        //1. 测试查询所有
        EmpServlet empServlet = new EmpServlet();
        List<Emp> empList = empServlet.findEmpList();
        System.out.println(empList);

        //2.测试通过id查询
        Emp emp = empServlet.get(1201);
        System.out.println(emp);

        //3. 修改
   //     emp.setName("old lee head");
     //   empServlet.update(emp);

        //4. 插入
//        Emp newEmp = new Emp(1212, "程志远", "boss", 1000000.0, "qphone");
//        empServlet.insert(newEmp);

        //5. 删除
    //    empServlet.delete(1212);
    }
}
