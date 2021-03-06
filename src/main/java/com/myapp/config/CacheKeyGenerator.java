package com.myapp.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Component("cacheKeyGenerator")
public class CacheKeyGenerator implements KeyGenerator {

	@Override
	public Object generate(Object target, Method method, Object... params) {
		final List<Object> key = new ArrayList<>();
		key.add(method.getDeclaringClass().getName());
		return key;
	}
}
