package com.ibm.api.models.inner;

public class Request {

    private String userName;
    private String password;
    private String ipAdress;

    public String getUserName() {
	return userName;
    }

    public void setUserName(String userName) {
	this.userName = userName;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getIpAdress() {
	return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
	this.ipAdress = ipAdress;
    }

    @Override
    public String toString() {
	return "Request [userName=" + userName + ", password=" + password + ", ipAdress=" + ipAdress + "]";
    }

}
