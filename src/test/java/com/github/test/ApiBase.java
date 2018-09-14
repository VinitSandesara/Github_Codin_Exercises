package com.github.test;

import Services.ApiServices;
import org.junit.BeforeClass;

import static io.restassured.RestAssured.baseURI;

public class ApiBase extends ApiServices {

    @BeforeClass
    public static void setUp() {
        baseURI = "https://api.github.com";

    }


}
