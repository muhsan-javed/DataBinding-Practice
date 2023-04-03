package com.muhsanjaved.databinding_practice.viewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.muhsanjaved.databinding_practice.models.User;

public class MainViewModel extends AndroidViewModel {

    private User mUser;

    public MainViewModel(@NonNull Application application) {
        super(application);
        mUser = new User("Ali", 20);
    }

    public User getUser(){
        return this.mUser;
    }
}
