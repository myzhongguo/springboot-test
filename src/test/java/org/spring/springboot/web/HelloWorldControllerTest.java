package org.spring.springboot.web;




import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * Spring Boot HelloWorldController 测试 - {@link HelloWorldController}
 *
 * Created by bysocket on 16/4/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldControllerTest {
    @Autowired
    private  HelloSender helloSender;
    @Test
    public void testSayHello() {
        assertEquals("Hello,World!",new HelloWorldController().sayHello());
    }

    @Test
        public void hello() throws Exception {
       helloSender.send();
    }
}
