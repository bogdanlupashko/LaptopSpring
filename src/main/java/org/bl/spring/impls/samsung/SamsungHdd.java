package org.bl.spring.impls.samsung;

import org.bl.spring.interfaces.Hdd;

public class SamsungHdd implements Hdd {

	public void write() {
		System.out.println("Write by Samsung");
	}

	public void read() {
		System.out.println("Read by Samsung");
	}

	@Override
	public String toString() {
		return SamsungHdd.class.toString();
	}
}
