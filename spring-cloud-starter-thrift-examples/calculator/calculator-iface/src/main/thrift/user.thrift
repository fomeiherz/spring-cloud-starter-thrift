namespace java io.ostenant.rpc.thrift.examples.vo
// thrift -out ../java -gen java user.thrift
struct UserVo {
    1: i32 uid,
    2: string username;
}
