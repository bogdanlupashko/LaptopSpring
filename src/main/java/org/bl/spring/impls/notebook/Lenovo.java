package org.bl.spring.impls.notebook;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import org.bl.spring.interfaces.Processor;
import org.bl.spring.interfaces.Hdd;
import org.bl.spring.interfaces.Video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

public class Lenovo extends BaseModel implements InitializingBean, DisposableBean {

	public Lenovo() {
	}

	public Lenovo(Processor processor, Video video, Hdd hdd) {
		super(processor, video, hdd);
	}

	public void start() {

	}

	public void finish() {

	}

	public void destroy() throws Exception {

	}

	public void afterPropertiesSet() throws Exception {

	}
}
