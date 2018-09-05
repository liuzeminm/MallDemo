package cn.test;

import cn.pojo.Notenote;
import cn.service.Colldelservice;
import cn.service.Collectionservice;
import cn.service.Colllookservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
        ac.getBean("");
        Colllookservice csi = (Colllookservice) ac.getBean("clsi");
        String selective = csi.Selective(1);
        System.out.println(selective);

    }
}