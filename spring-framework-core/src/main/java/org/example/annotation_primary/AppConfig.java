package org.example.annotation_primary;

import org.example.share.EmptyObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class AppConfig {
	@Bean
	public EmptyObject eo1() {
		return new EmptyObject();
	}
	@Bean
	@Primary
	public EmptyObject eo2() {
		return new EmptyObject();
	}
}
