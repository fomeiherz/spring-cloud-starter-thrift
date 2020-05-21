package io.ostenant.rpc.thrift.examples.rpc;

import io.ostenant.rpc.thrift.examples.thrift.UserService;
import io.ostenant.rpc.thrift.examples.vo.UserVo;
import io.ostenant.rpc.thrift.server.annotation.ThriftService;
import org.apache.thrift.TException;

/**
 * @description:  RPC服务：用于暴露服务
 * @author: fomy
 * @create: 2020/5/21 17:29
 **/
@ThriftService(name = "rpcUserService", version = 2.0)
public class RpcUserService implements UserService.Iface {
    @Override
    public UserVo getUser(int uid, String username) throws TException {
        return new UserVo().setUid(uid).setUsername(username);
    }
}
