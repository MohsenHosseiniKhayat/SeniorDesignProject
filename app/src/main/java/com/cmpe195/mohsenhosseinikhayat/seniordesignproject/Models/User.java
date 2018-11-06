package com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class User
{
    private static User ourInstance = new User();

    public static User getInstance() {
        return ourInstance;
    }
    public GoogleSignInAccount userAccount;

    private User()
    {
        if (getInstance() != null)
        {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public GoogleSignInAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(GoogleSignInAccount userAccount) {
        this.userAccount = userAccount;
    }
}
