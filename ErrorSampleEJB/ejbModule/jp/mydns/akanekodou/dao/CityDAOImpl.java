package jp.mydns.akanekodou.dao;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import java.util.List;

import jp.mydns.akanekodou.entity.City;

@Stateless
public class CityDAOImpl implements CityDAO {
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<City> all() {
		Query query = manager.createQuery("from City");
		@SuppressWarnings("unchecked")
		List<City> result = query.getResultList();
		return result;
	}

	@Override
	public City find(int id) {
		return manager.find(City.class, id);
	}
}
