package com.app.regfirmas.config;

public class Transacciones {
    //Nombre de base de datos
    public static final String DATE_BASE = "dbFirmas";
    //Tabla firmas
    public static final String TABLE_FIRMA = "tbFirmas";
    //Datos de la tabla tbFirmas
    public static final String ID = "id";
    public static final String FIRMA = "firma";
    public static final String DESCRIPCION = "descripcion";

    //Crear la tabla tbFirmas
    public static final String CREATE_TABLE_FIRMAS ="CREATE TABLE "+TABLE_FIRMA+" (id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                                                     "imagen LONGBLOB, descripcion TEXT)";

    //Elimina tabla tbFirmas
    public static final String DROP_TABLE_FIRMAS = "DROP TABLE IF EXISTS " + TABLE_FIRMA;

    //Consultar Tabla Photos
    public static final String SELECT_TABLE_FIRMAS = "SELECT * FROM "+TABLE_FIRMA;
}
