package com.liqihua.im.config;


import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIONamespace;
import com.corundumstudio.socketio.SocketIOServer;
import com.liqihua.im.constant.IMConstant;
import com.liqihua.im.handler.IMEventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author liqihua
 * @since 2018/6/1
 */
@Component
public class ServerRunner implements CommandLineRunner {


    private final SocketIOServer server;
    private final SocketIONamespace imNameSpace;


    @Autowired
    public ServerRunner(SocketIOServer server) {
        this.server = server;
        imNameSpace = server.addNamespace(IMConstant.NameSpace.IM.getNamespace());
    }


    @Bean
    public SocketIONamespace getIMSocketIONameSpace(SocketIOServer server){
        imNameSpace.addListeners(new IMEventHandler(server));
        return imNameSpace  ;
    }


    @Override
    public void run(String... args) throws Exception {
        server.start();
    }
}
