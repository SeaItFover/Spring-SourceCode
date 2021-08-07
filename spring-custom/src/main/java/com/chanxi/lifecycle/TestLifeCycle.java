package com.chanxi.lifecycle;

import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Component;

//@Component
public class TestLifeCycle implements Lifecycle {

	@Override
	public void start() {
		System.out.println("container start");
	}

	@Override
	public void stop() {
		System.out.println("container stop");
	}

	@Override
	public boolean isRunning() {
		return false;
	}
}
