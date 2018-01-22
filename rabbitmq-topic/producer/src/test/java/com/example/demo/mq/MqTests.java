package com.example.demo.mq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MqTests {
	@Autowired
	private Producer producer;

	@Test
	public void send() {
		producer.send("Love it");
	}
	
	@Test
	public void send2() {
		producer.onlySendToMessage2("2 is U");
	}
}