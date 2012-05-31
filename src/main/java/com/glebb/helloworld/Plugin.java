package com.glebb.helloworld;

import javax.swing.JComponent;

import net.pms.external.ExternalListener;

public class Plugin implements ExternalListener {

	@Override
	public JComponent config() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String name() {
		return "HelloWorld Plugin";
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		
	}

}
