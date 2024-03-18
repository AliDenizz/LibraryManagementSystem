package org.bootcampjava.entities;

import org.bootcampjava.database.service.DBService;

public class Staff{
    private String name;
    private int id;
    private String phoneNumber;

    public Staff(String name, int id, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        System.out.println(getName()+" isimli çalışan sisteme eklenmiştir.");
        DBService dbSaving=new DBService();
        dbSaving.dbStaff(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
