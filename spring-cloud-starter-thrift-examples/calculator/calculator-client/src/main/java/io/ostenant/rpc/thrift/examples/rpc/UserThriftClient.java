package io.ostenant.rpc.thrift.examples.rpc;

import io.ostenant.rpc.thrift.client.annotation.ThriftClient;
import io.ostenant.rpc.thrift.client.common.ThriftClientAware;
import io.ostenant.rpc.thrift.examples.thrift.UserService;

/**
 * @description:  客户端：用于访问远程的服务
 * @author: fomy
 * @create: 2020/5/21 17:30
 **/
@ThriftClient(serviceId = "thrift-calculator-rpc-server", refer = UserService.class, version = 2.0)
public interface UserThriftClient extends ThriftClientAware<UserService.Client> {
}
