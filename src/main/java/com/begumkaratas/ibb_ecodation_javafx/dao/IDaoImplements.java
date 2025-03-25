package com.begumkaratas.ibb_ecodation_javafx.dao;

import java.sql.Connection;

import com.begumkaratas.ibb_ecodation_javafx.database.SingletonDBConnection;

public interface IDaoImplements<T> extends ICrud<T>,IGenericsMethod<T>,ILogin<T> {

    // Gövdeli Method
    default Connection iDaoImplementsDatabaseConnection() {
        // Singleton DB
        return SingletonDBConnection.getInstance().getConnection();

        // Singleton Config
        //return SingletonPropertiesDBConnection.getInstance().getConnection();
    }
}
