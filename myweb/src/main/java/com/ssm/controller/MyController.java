package com.ssm.controller;

import com.ssm.pojo.Dept_Pojo;
import com.ssm.service.Dept_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    /**
     * Access path: 1:Access by function html(Login.html)
     *                localhost:8080/myweb/ default welcome page is /webapp/login.html
     *              2:Access with url directly
     *                localhost:8080/myweb/Test.do
     * @return /WEB-INF/Views/Test.jsp
     */


    @Autowired
    private Dept_Service dept_service;  //autowired service as a bean
    @RequestMapping("/Test.do")
    public String test(ModelMap modelMap, @RequestParam("U_acc") String U_acc){
        Integer deptno=Integer.parseInt(U_acc); //Transfer a String value from web to Integer AKA the correct parm form
        System.out.println(deptno); //Output the value after transfer
        /**
         * Use the parm to select in database,If the result isn't null
         * return the success page(/WEB-INF/Test.jsp)
         * else redirect to Login.html and console output reded.
         */
        if(dept_service.add_test(deptno)!=null){
            Dept_Pojo dept_pojo=dept_service.add_test(deptno);
            ModelAndView M=new ModelAndView();
            modelMap.addAttribute("dept",dept_pojo);
            return "Test";
        }else{
            System.out.println("reded");
            return "redirect:Login.html";

        }
    }
}
