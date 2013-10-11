package jp.mydns.akanekodou.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;

@Entity
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String pref;
	private Date designated;
	private double area;
	private int population;
	@ManyToOne
	private District district;

	public City() { }

	public City(
		String name,
		String pref,
		Date designated,
		double area,
		int population,
		District district
	) {
		this.name = name;
		this.pref = pref;
		this.designated = designated;
		this.area = area;
		this.population = population;
		this.district = district;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPref() {
		return pref;
	}
	public void setPref(String pref) {
		this.pref = pref;
	}
	public Date getDesignated() {
		return designated;
	}
	public void setDesignated(Date designated) {
		this.designated = designated;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
}
