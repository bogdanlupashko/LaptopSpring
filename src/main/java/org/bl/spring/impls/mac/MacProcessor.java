package org.bl.spring.impls.mac;

import org.bl.spring.interfaces.Processor;

public class MacProcessor implements Processor {

	public void overLoad() {
		System.out.println("Catched from Mac!!");
	}

	@Override
	public String toString() {
		return MacProcessor.class.toString();
	}
}
