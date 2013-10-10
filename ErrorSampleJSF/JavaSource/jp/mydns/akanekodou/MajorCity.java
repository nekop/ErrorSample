package jp.mydns.akanekodou;

import javax.ejb.EJB;
import javax.annotation.PostConstruct;

import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlInputHidden;

import java.util.List;


import jp.mydns.akanekodou.dao.CityDAO;
import jp.mydns.akanekodou.entity.City;

@ManagedBean
public class MajorCity {
	@EJB
	private CityDAO dao;
	private HtmlInputHidden id;
	private List<City> cities;
	private City city;

	@PostConstruct
	private void init() {
		cities = dao.all();
	}

	public HtmlInputHidden getId() {
		return id;
	}
	public void setId(HtmlInputHidden id) {
		this.id = id;
	}

	public List<City> getCities() {
		return cities;
	}
	public City getCity() {
		return city;
	}

	public String detail() {
		int id = (Integer)this.id.getValue();
		city = dao.find(id);
		return "detail";
	}
}
