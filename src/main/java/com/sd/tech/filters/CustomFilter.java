package com.sd.tech.filters;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Configuration
@Slf4j
public class CustomFilter  implements GlobalFilter{

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {


		ServerHttpRequest serverHttpRequest = exchange.getRequest();
		//System.out.println("Authorization :: "+serverHttpRequest.getHeaders().getFirst("Authorization"));
		log.info("Authorization :: "+serverHttpRequest.getHeaders().getFirst("Authorization"));
		String securityCode = serverHttpRequest.getHeaders().getFirst("Authorization");
		/*
		 * if(securityCode.equals("divya")) return chain.filter(exchange); else return
		 * null;
		 */
		return chain.filter(exchange);
	}

}
