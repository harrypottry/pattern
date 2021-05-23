package strategy.test;

import com.test.patternApplication;
import com.test.preties.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {patternApplication.class})
public class StragtegyTest {

    @Autowired
    private static OrderService orderService;

    /**
     * https://www.cnblogs.com/bulrush/p/12755279.html
     */
    @Test
    public void myorder() {
            orderService.handleOrder(1);
    }
}
