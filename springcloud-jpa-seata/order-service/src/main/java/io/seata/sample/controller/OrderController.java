package io.seata.sample.controller;

import io.seata.sample.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * Description：
 *
 * @author fangliangsheng
 * @date 2019-04-04
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/create")
    public Boolean create(String userId, String commodityCode, Integer count, HttpServletRequest request) {

        orderService.showHTTPHeaders(request);
        orderService.create(userId, commodityCode, count);
        return true;
    }

}
