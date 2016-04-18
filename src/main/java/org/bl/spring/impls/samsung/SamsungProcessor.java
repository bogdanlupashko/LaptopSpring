package org.bl.spring.impls.samsung;

import org.bl.spring.interfaces.Processor;

public class SamsungProcessor implements Processor {

	public void overLoad() {
		System.out.println("Catched from Samsung!!");
	}

	@Override
	public String toString() {
		return SamsungProcessor.class.toString();
	}
}
