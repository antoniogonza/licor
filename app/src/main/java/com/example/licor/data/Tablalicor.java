package com.example.Licor.data;

import android.provider.BaseColumns;

public class Tablalicor {

        public static abstract class tablalicor implements BaseColumns {
            public static final String TABLE_NAME ="licornuevo";

            public static final String ID = "id";
            public static final String Nombre = "nombre";
            public static final String Dificultad= "dificultad";
            public static final String Ingredientes ="ingredientes";
            public static final String Preparacion = "preparacion";
            public static final String Tiempo = "tiempo";


        }

}
