package io.ostenant.rpc.thrift.examples.controller;

import io.ostenant.rpc.thrift.client.annotation.ThriftRefer;
import io.ostenant.rpc.thrift.examples.rpc.UserThriftClient;
import io.ostenant.rpc.thrift.examples.vo.UserVo;
import org.apache.thrift.TException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: fomy
 * @create: 2020/5/21 18:17
 **/
@RestController
@RequestMapping("/rpc")
public class RpcUserController {

    @ThriftRefer
    private UserThriftClient userThriftClient;

    @GetMapping("/getUser")
    public UserVo getUser(@RequestParam int uid, @RequestParam String username) throws TException {
        return userThriftClient.client().getUser(uid, username);
    }
}
