package org.bl.spring.impls.samsung;

import org.bl.spring.interfaces.Video;

public class SamsungVideo implements Video {

	public void display() {
		System.out.println("Display to Samsung!");
	}

	@Override
	public String toString() {
		return SamsungVideo.class.toString();
	}
}
