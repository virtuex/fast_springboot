package zkt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zkt.domain.City;

/**
 * 城市 DAO 接口类
 *
 * Created by bysocket on 07/02/2017.
 */
@Repository
public interface CityDao extends JpaRepository<City, Long> {
    City findCityByCityName(String cityname);
}
