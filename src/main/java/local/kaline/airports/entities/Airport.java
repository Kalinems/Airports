/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.kaline.airports.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author ppjata
 */

@Entity
@Table(name = "airport")
public class Airport {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 private String name;
 private String city;
 private String country;

 @Column(name = "iatacode")
 private String iataCode;

 @Column(name = "icaocode")
 private String icaoCode;

 
 private double latitude;
 private double longitude;
 private double altitude;

 @Column(name = "offsetutc")
 private double offsetFromUTC;

 @Column(name = "dstcode")
 private String dstCode;
 private String timezone;

    public Airport() {
    }

    public Airport(long id, String name, String city, String country, String iataCode, String icaoCode, double latitude, double longitude, double altitude, double offsetFromUTC, String dstCode, String timezone) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.country = country;
        this.iataCode = iataCode;
        this.icaoCode = icaoCode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.offsetFromUTC = offsetFromUTC;
        this.dstCode = dstCode;
        this.timezone = timezone;
    }
 
 
 

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public String getIcaoCode() {
        return icaoCode;
    }

    public void setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getOffsetFromUTC() {
        return offsetFromUTC;
    }

    public void setOffsetFromUTC(double offsetFromUTC) {
        this.offsetFromUTC = offsetFromUTC;
    }

    public String getDstCode() {
        return dstCode;
    }

    public void setDstCode(String dstCode) {
        this.dstCode = dstCode;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
