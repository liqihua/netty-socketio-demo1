package com.liqihua.im.config;

import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOServer;
import com.liqihua.im.constant.IMConstant;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

/**
 * @author liqihua
 * @since 2018/6/1
 */
@org.springframework.context.annotation.Configuration
public class ServerConfig {
    @Value("${im.port}")
    private Integer port;

    @Bean
    public SocketIOServer socketIOServer(){
        Configuration config = new Configuration();
        config.setHostname("localhost");
        config.setPort(port);
        SocketIOServer server = new SocketIOServer(config);
        return server;
    }



}
