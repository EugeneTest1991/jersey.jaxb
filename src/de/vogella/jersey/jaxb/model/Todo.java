package de.vogella.jersey.jaxb.model;

import javax.xml.bind.annotation.XmlRootElement;

/*
 * Annotate  a  Java  bean  with  @XmlRootElement,  
 * and  the  JAXB  framework  (a  part  of  Java  EE)  
 * will  turn  it  into  an  XML  or  JSON  document. 
 */
@XmlRootElement
public class Todo {
	private String summary;
	private String description;

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}