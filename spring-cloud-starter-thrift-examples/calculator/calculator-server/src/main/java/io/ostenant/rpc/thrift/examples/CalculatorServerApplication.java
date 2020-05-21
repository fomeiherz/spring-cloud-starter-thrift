package io.ostenant.rpc.thrift.examples;

import io.ostenant.rpc.thrift.server.annotation.EnableThriftServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableThriftServer
@SpringBootApplication
public class CalculatorServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorServerApplication.class, args);
    }

}
