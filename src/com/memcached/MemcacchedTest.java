package com.memcached;

import com.util.MemcachedUtil;

public class MemcacchedTest {
    public static void main(String[] args){
        MemcachedUtil memcachedUtil = MemcachedUtil.getInstance();
        Employee employee = new Employee();
        employee.setEmpName("liwei");
        employee.setDeptName("kaifazhongxin");
        employee.setCompanyName("zhongruan");
        memcachedUtil.add("liwei", employee);

        Employee liwei = (Employee)memcachedUtil.get("liwei");
        System.out.print(liwei.getEmpName()+"+"+liwei.getCompanyName()+"+"+liwei.getDeptName());
    }
}
