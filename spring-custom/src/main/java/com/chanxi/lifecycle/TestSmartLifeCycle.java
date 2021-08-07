package com.chanxi.lifecycle;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

@Component
public class TestSmartLifeCycle implements SmartLifecycle {

	@Override
	public boolean isAutoStartup() {
		return true;
	}

	@Override
	public void stop(Runnable callback) {
		System.out.println("smart stop");
		callback.run();
	}

	@Override
	public int getPhase() {
		return 0;
	}

	@Override
	public void start() {
		System.out.println("smart start");
	}

	@Override
	public void stop() {

	}

	@Override
	public boolean isRunning() {
		return false;
	}
}
