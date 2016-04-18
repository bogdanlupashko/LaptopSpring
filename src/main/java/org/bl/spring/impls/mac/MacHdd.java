package org.bl.spring.impls.mac;

import org.bl.spring.interfaces.Hdd;

public class MacHdd implements Hdd {

	public void write() {
		System.out.println("Write by Mac");
	}

	public void read() {
		System.out.println("Read by Mac");
	}

	@Override
	public String toString() {
		return MacHdd.class.toString();
	}
}
