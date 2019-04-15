package zkt.service;


import zkt.domain.City;

import java.util.List;

/**
 * 城市业务逻辑接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByNameJpa(String cityName);
    City findCityByNameMybatis(String cityName);
    List<City> findAllCities();
}
