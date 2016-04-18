package org.bl.spring.impls.mac;

import org.bl.spring.interfaces.Video;

public class MacVideo implements Video {

	public void display() {
		System.out.println("Display to Mac!");
	}

	@Override
	public String toString() {
		return MacVideo.class.toString();
	}
}
