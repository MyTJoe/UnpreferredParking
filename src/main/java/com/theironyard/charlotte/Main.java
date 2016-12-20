package com.theironyard.charlotte;

import spark.Spark;

import java.util.ArrayList;

import static spark.Spark.before;

public class Main {

    public static void main(String[] args) {
        Spark.get("/", ((request, response) -> "Hello World!"));
        before((request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
        });
    }
}
