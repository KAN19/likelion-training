package com.ronald.naverhomework.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        //Từ STOMP trong tên phương thức đến từ Spring frameworks STOMP implementation
//        Đăng ký một websocket endpoint mà các máy khách sẽ dùng để kết nói đén máy chủ
        registry.addEndpoint("/ws").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
//        Xác định các thư có đích đến là "/app" sẽ được định tuyến đến các phương thức xử lý tin nhắn
        registry.setApplicationDestinationPrefixes("/app");
//        Được định tuyến với Message Broker(Ở đây dùng bộ nhớ máy)
//        Có thể sử dụng Message Broker bất kỳ để thay thế ví dụ RabbitMQ hoặc ActiveMQ
        registry.enableSimpleBroker("/topic");
    }
}
