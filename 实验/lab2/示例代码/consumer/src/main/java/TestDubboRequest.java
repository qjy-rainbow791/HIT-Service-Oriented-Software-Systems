import com.hit.lyx.dubbo.demo.api.service.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TestDubboRequest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/consumer.xml");
        ctx.start();
        UserService service = ctx.getBean(UserService.class);
        House house= ctx.getBean(House.class);
        HouseManager houseManager=ctx.getBean(HouseManager.class);
        UserManager userManager=ctx.getBean(UserManager.class);
        UtilData utilData=ctx.getBean(UtilData.class);

        Scanner in = new Scanner(System.in);
        while (true){
            Long id = in.nextLong();
            if(id == -1)
                break;
            else
                System.out.println(service.getUser(id) + "+" + house.m() + "调用了" + houseManager.ip());
        }
    }
}
