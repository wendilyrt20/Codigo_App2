package edu.pucmm.eict;

import io.javalin.Javalin;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Javalin app = Javalin.create(config -> {
            // config.addStaticFiles("/publico"); //desde la carpeta de resources --> Ruta estatica.
        }).start(8000);

        System.out.println("Javalin");

        app.get("/", ctx -> {
            ctx.result("Bienvenido a aplicacion 2");
        });
    }
}
