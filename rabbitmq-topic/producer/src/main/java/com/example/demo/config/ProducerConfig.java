package com.example.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerConfig {

	@Bean
	public TopicExchange exchange() {
		return new TopicExchange("myexchange");
	}

	@Bean(name = "message1")
	public Queue queueMessage1() {
		return new Queue("topic.message1");
	}

	@Bean(name = "message2")
	public Queue queueMessage2() {
		return new Queue("topic.message2");
	}

	@Bean
	Binding bindingExchangeMessage1(@Qualifier("message1") Queue queueMessage1, TopicExchange exchange) {
		return BindingBuilder.bind(queueMessage1).to(exchange).with("topic.message1");
	}

	@Bean
	Binding bindingExchangeMessage2(@Qualifier("message2") Queue queueMessage2, TopicExchange exchange) {
		return BindingBuilder.bind(queueMessage2).to(exchange).with("topic.#");
		// *:stand for a word. #:stand for 0 or many word.
	}
}