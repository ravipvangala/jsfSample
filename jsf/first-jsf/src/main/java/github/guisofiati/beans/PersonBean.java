package github.guisofiati.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlCommandButton;

@SessionScoped
@ManagedBean(name = "personBean")
public class PersonBean {
	
	private String name;
	private HtmlCommandButton htmlCommandButton;
	
	private List<String> names = new ArrayList<String>();
	
	public PersonBean() {
		
	}

	public PersonBean(String name) {
		this.name = name;
	}
	
	public String addName() {
		names.add(name);
		
		if (names.size() == 3) {
			htmlCommandButton.setDisabled(true);
			return "dynamic"; // page
		}
		
		return "";
	}
		
	public List<String> getNames() {
		return names;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HtmlCommandButton getHtmlCommandButton() {
		return htmlCommandButton;
	}

	public void setHtmlCommandButton(HtmlCommandButton htmlCommandButton) {
		this.htmlCommandButton = htmlCommandButton;
	}
}
