package com.ibm.api.models.outer;

public class OuterResponse {

    private String status;
    private String countryCode;
    private String city;
    private String query;

    public String getStatus() {
	return status;
    }

    public void setStatus(String status) {
	this.status = status;
    }

    public String getCountryCode() {
	return countryCode;
    }

    public void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getQuery() {
	return query;
    }

    public void setQuery(String query) {
	this.query = query;
    }

    @Override
    public String toString() {
	return "outerResponse [status=" + status + ", countryCode=" + countryCode + ", city=" + city + ", query="
		+ query + "]";
    }

}
