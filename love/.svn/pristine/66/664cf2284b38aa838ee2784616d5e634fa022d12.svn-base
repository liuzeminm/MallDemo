import cn.pojo.Useri;
import cn.setservice.UpdVerService;
import cn.setservice.UpdVerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testv {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
        UpdVerService us = (UpdVerService) ac.getBean("ver");

        Useri u = new Useri();
        u.setUserid(1);

//        u.setUsername("men");
//        u.setUsersex("men");
//        u.setUseroftensite("beijing");
//        u.setUserdatebirth("1996-02-03");
//        u.setUserphone("18935153434");
        u.setUserloginpassword("147258");
        String t = "pwd";
        Object o = us.verify(u,t);
        System.out.println(o);

    }
}
