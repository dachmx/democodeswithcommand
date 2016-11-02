package dubbo.provider.service.impl;

import dubbo.common.service.HelloService;

/**
 * Created by lenovo on 2014/5/11.
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String str) {
       return "Hello "+str;
    }
}
