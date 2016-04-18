package org.bl.spring.impls.notebook;

import org.bl.spring.interfaces.Hdd;
import org.bl.spring.interfaces.NoteBook;
import org.bl.spring.interfaces.Processor;
import org.bl.spring.interfaces.Video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lenovo", propOrder = {
		"hdd",
		"video",
		"processor"
})
public abstract class BaseModel implements NoteBook {

	private String processor;
	private String video;
	private String hdd;

	public BaseModel() {
		System.out.println(this + " - BaseModel constructor()");
	}

	public BaseModel(Processor processor, Video video, Hdd hdd) {
		this();
		this.processor = processor.toString();
		this.video = video.toString();
		this.hdd = hdd.toString();
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
}
