package com.example.android.bookstore.data;

import android.provider.BaseColumns;

/**
 * Contract class to define the name of the table and constants.
 */

public final class BookContract {

    private BookContract() {}

    public static final class BookEntry implements BaseColumns {

        public final static String TABLE_NAME = "books";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_BOOK_NAME = "name";
        public final static String COLUMN_BOOK_PRICE = "price";
        public final static String COLUMN_BOOK_QUANTITY = "quantity";
        public final static String COLUMN_BOOK_SUPPLIER = "supplier";
        public final static String COLUMN_SUPPLIER_PHONE = "phone";

    }
}
