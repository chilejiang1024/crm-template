package cn.chile.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chile on 2016/10/28.
 */

@RequestMapping("/test")

@Controller
public class TestHandler {

    @RequestMapping("/1")
    public void test1() {
        System.out.println("Successful_1!");
    }

    @RequestMapping("/2")
    public void test2() {
        System.out.println("Successful_2!");
    }

    @RequestMapping("/3")
    public void test3() {
        System.out.println("Successful_3!");
    }

}
