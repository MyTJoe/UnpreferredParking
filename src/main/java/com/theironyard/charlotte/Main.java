package com.theironyard.charlotte;

import spark.Spark;

import java.util.ArrayList;

import static spark.Spark.before;

public class Main {

    public static void main(String[] args) {
        String port = System.getenv("PORT");

        if (port != null) {
            Spark.port(Integer.valueOf(port));
        }

        Spark.before((request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
        });

        Spark.get("/", ((request, response) -> "Hello, World!"));
    }
}
