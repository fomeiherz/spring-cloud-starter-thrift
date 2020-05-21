namespace java io.ostenant.rpc.thrift.examples.thrift
// thrift -out ../java -gen java user-service.thrift
include "user.thrift"

    service UserService {
        user.UserVo getUser(1: i32 uid, 2: string username)
    }