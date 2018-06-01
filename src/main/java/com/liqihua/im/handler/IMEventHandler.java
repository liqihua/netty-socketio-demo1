package com.liqihua.im.handler;

import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.OnConnect;
import com.corundumstudio.socketio.annotation.OnDisconnect;
import com.corundumstudio.socketio.annotation.OnEvent;
import org.springframework.beans.factory.annotation.Autowired;

public class IMEventHandler     
{  
	protected SocketIOServer server;
	
    @Autowired
    public IMEventHandler(SocketIOServer server)
    {  
        this.server = server ;
    }  
    
    @OnConnect
    public void onConnect(SocketIOClient client) {
		System.out.println("--- onConnect");
		/**
		 * 用户进入到对话连接 ， 排队用户请求 , 如果返回失败，表示当前坐席全忙，用户进入排队状态，当前提示信息 显示 当前排队的队列位置，不可进行对话，用户发送的消息作为留言处理
		 */


		/**
		 * 加入到 缓存列表
		 */
    }

	//消息接收入口，收发消息，用户向坐席发送消息和 坐席向用户发送消息
	@OnEvent(value = "message")
	public void onEvent(SocketIOClient client, AckRequest request) {
		System.out.println("--- onEvent message");
		/**
		 * 处理表情
		 */

	}

	//添加@OnDisconnect事件，客户端断开连接时调用，刷新客户端信息
    @OnDisconnect
    public void onDisconnect(SocketIOClient client) {
		System.out.println("--- onDisconnect");
		/**
		 * 用户主动断开服务
		 */
    }  




    //消息接收入口，用于接受网站资源用户传入的 个人信息
    /*@OnEvent(value = "new")
    public void onEvent(SocketIOClient client, AckRequest request){

    } */
    
  	//消息接收入口，坐席状态更新
    /*@OnEvent(value = "agentstatus")
    public void onEvent(SocketIOClient client, AckRequest request)
    {

    } */
    

}  