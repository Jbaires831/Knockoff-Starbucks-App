package com.example.knockoffstarbucksapp;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface UserDao {

    @Insert
    void insertUser(UserTable userTable);

    @Query("SELECT EXISTS (SELECT * from UserTable where username=:username)")
    boolean is_taken(String username);

    @Query("SELECT EXISTS (SELECT * from UserTable where username=:userName AND password=:password)")
    boolean login(String userName, String password);
}
