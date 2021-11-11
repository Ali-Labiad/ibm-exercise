package com.ibm.api.models.inner;

public class Response {

    private String uuid;
    private String city;

    public String getUuid() {
	return uuid;
    }

    public void setUuid(String uuid) {
	this.uuid = uuid;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    @Override
    public String toString() {
	return "innerResponse [uuid=" + uuid + ", city=" + city + "]";
    }

}
