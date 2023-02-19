package com.user.user_service.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long userId;
    private String userName;
    private String contactNo;
    List<Contact> contacts = new ArrayList<>();

    public User(Long userId, String userName, String contactNo, List<Contact> contacts) {
        this.userId = userId;
        this.userName = userName;
        this.contactNo = contactNo;
        this.contacts = contacts;
    }

    public User(Long userId, String userName, String contactNo) {
        this.userId = userId;
        this.userName = userName;
        this.contactNo = contactNo;
    }


    


    /**
     * @return Long return the userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return String return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return String return the contactNo
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public List<Contact> getContacts()
    {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}