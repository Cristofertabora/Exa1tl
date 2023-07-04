package Configuracion;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Tansacciones {


    public static String CreateTBDfut;
    public static String DropTBFut;

    public class DatabaseHelper extends SQLiteOpenHelper {
        public static final String DATABASE_NAME = "TLENG";
        public static final int DATABASE_VERSION = 1;

        public static final String tablafut = "fut";

        public static final String COLUMN_ID = "id";
        public static final String COLUMN_NOMBRES = "nombres";
        public static final String COLUMN_APELLIDOS = "apellidos";
        public static final String COLUMN_PAIS = "pais";
        public static final String COLUMN_EDAD = "edad";
        public static final String COLUMN_POSICION = "posicion";
        public static final String COLUMN_IMAG = "imag";

        public static final String CreateTBDfut = "CREATE TABLE " + tablafut + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COLUMN_PAIS + " TEXT,"
                + COLUMN_NOMBRES + " TEXT,"
                + COLUMN_EDAD + " INTEGER,"
                + COLUMN_APELLIDOS + " TEXT,"
                + COLUMN_POSICION + " TEXT,"
                + COLUMN_IMAG + " BLOB)";

        public static final String DROP_TABLE_FUT = "DROP TABLE IF EXISTS " + tablafut;

        public DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(CreateTBDfut);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL(DropTBFut);
            onCreate(db);
        }
    }


}

