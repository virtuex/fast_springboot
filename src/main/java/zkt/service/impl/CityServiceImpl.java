package zkt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zkt.dao.CityDao;
import zkt.dao.mapper.CityMapper;
import zkt.domain.City;
import zkt.domain.CityExample;
import zkt.service.CityService;

import java.util.List;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class CityServiceImpl implements CityService {


    @Autowired
    private CityDao cityDao;

    @Autowired
    private CityMapper cityMapper;

    /**
     * 这个方法是使用Spring Data JPA实现的，比较简单
     * @param cityName
     * @return
     */
    @Override
    public City findCityByNameJpa(String cityName) {
        return cityDao.findCityByCityName(cityName);
    }

    /**
     * 这个方法是使用Mybatis的
     * @param cityName
     * @return
     */
    @Override
    public City findCityByNameMybatis(String cityName) {
        CityExample example = new CityExample();
        example.or().andCityNameEqualTo(cityName);
        return cityMapper.selectByExample(example).get(0);
    }

    @Override
    public List<City> findAllCities() {
        return cityDao.findAll();
    }
}
