package zkt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zkt.domain.City;
import zkt.service.CityService;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/jpa/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findCityByNameJpa(cityName);
    }

    @RequestMapping(value = "/city", method = RequestMethod.GET)
    public String findOneCity() {
        System.out.println("Test");
        return "test";
    }

    @RequestMapping(value = "/api/mybatis/city", method = RequestMethod.GET)
    public City findOneCityMybatis(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findCityByNameMybatis(cityName);
    }

}
