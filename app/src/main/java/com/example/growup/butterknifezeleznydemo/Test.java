package com.example.growup.butterknifezeleznydemo;

import android.util.Log;
import android.widget.Toast;

import java.util.List;

/**
 * 作者：        追梦
 * 邮箱：        1521541979@qq.com
 * 公司：        杭州码友网络科技有限公司
 * 日期：        2016/6/23 17:15
 * 描述：
 */
public class Test
{

    /**
     * firstName : Bill
     * lastName : Gates
     */

    private List<EmployeesBean> employees;

    public List<EmployeesBean> getEmployees() { return employees;}

    public void setEmployees(List<EmployeesBean> employees) { this.employees = employees;}

    public static class EmployeesBean
    {
        private String firstName;
        private String lastName;

        public String getFirstName() { return firstName;}

        public void setFirstName(String firstName) { this.firstName = firstName;}

        public String getLastName() { return lastName;}

        public void setLastName(String lastName)
        {
            this.lastName = lastName;
        }









    }
}
