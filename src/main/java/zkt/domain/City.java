package zkt.domain;

import javax.persistence.*;

@Entity
@Table(name = "TB_CITY")
public class City {
    @Id
    //设置主键并且设置主键为自增
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "CITY_ID")
    private Long id;

    @Column(name = "CITY_NAME")
    private String cityName;

    @Column(name = "CITY_DESC")
    private String description;

    @Column(name = "CITY_PROVINCE")
    private Long cityProvince;

    @Column(name = "CITY_PROVINCE_ID")
    private Long provinceId;

    public City(Long id, String cityName, String description, Long cityProvince, Long provinceId) {
        this.id = id;
        this.cityName = cityName;
        this.description = description;
        this.cityProvince = cityProvince;
        this.provinceId = provinceId;
    }

    public City() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getCityProvince() {
        return cityProvince;
    }

    public void setCityProvince(Long cityProvince) {
        this.cityProvince = cityProvince;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }
}