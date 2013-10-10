package jp.mydns.akanekodou.dao;

import javax.ejb.Local;

import java.util.List;

import jp.mydns.akanekodou.entity.City;

@Local
public interface CityDAO {
	List<City> all();
	City find(int id);
}
