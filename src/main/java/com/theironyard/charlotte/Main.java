package com.theironyard.charlotte;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import spark.Spark;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Lot> lotInfo = new ArrayList();
    private static ArrayList<Car> updateLot = new ArrayList();
    private static JsonParser parser = new JsonParser();
    private static JsonSerializer serializer = new JsonSerializer();

    public static void main(String[] args) {
        lotInfo.add(new Lot(0, 20, 5));
        lotInfo.add(new Lot(1, 18, 6));
        lotInfo.add(new Lot(2, 15, 5));
        lotInfo.add(new Lot(3, 15, 6));

        String port = System.getenv("PORT");

        if (port != null) {
            Spark.port(Integer.valueOf(port));
        }

        Spark.before((request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
        });

        Spark.get("/lot-info", (request, response) -> {
            System.out.println("Here is the lot info.");
            return serializer.serialize(lotInfo);
        });

        Spark.post("/add-car", (request, response) -> {
            System.out.println("Updating lot.");
            return parser.parse(request.body(), Car.class);
            
        });
    }
}
