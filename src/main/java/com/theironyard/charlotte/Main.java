package com.theironyard.charlotte;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import spark.Spark;

import java.util.ArrayList;

public class Main {
    private static ArrayList<UpdateLot> lotInfo = new ArrayList();
    private static JsonParser parser = new JsonParser();
    private static JsonSerializer serialize = new JsonSerializer();

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
