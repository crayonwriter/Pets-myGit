package com.example.android.pets.data;

import android.provider.BaseColumns;

//Outer class
public final class PetContract {
private PetContract() {}

//Inner class for the Pets table
    public static final class PetEntry implements BaseColumns {

        //Constants for the columns
        public static final String TABLE_NAME = "pets";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_WEIGHT = "weight";
        public static final String COLUMN_PET_GENDER = "gender";

        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}
