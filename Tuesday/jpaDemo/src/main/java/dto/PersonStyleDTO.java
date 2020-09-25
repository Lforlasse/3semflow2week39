/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Lasse Emil
 */
public class PersonStyleDTO {

    private String name;
    private int year;
    private String swinStyle;

    public PersonStyleDTO(String name, int year, String swinStyle) {
        this.name = name;
        this.year = year;
        this.swinStyle = swinStyle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSwinStyle() {
        return swinStyle;
    }

    public void setSwinStyle(String swinStyle) {
        this.swinStyle = swinStyle;
    }

}
