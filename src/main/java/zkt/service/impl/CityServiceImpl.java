package zkt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zkt.dao.CityDao;
import zkt.domain.City;
import zkt.service.CityService;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class CityServiceImpl implements CityService {


    @Autowired
    private CityDao cityDao;

    /**
     * 这个方法是使用Spring Data JPA实现的，比较简单
     * @param cityName
     * @return
     */
    @Override
    public City findCityByNameJpa(String cityName) {
        return cityDao.findCityByCityName(cityName);
    }

}
