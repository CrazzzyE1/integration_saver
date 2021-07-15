package com.litvak.integration_saver.integration;

import com.litvak.integration_saver.domain.Product;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface ChannelGateway {
    @Gateway(requestChannel = "channel")
    void process(Product product);
}