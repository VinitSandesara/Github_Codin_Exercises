package com.github.test;

import io.restassured.http.ContentType;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URLDecoder;

import static io.restassured.RestAssured.given;


public class testGithubSearchApi extends ApiBase {


    @Test
    public void Api_Search_Repositories_Thru_Author_Name() throws UnsupportedEncodingException {

        String JsonResponse = given()
                .accept(ContentType.JSON)
                .param("q", getReader().getAuthorName())
                .when()
                .get(getReader().getSearchApiEndPoint())
                .thenReturn()
                .asString();

        System.out.println("Api Response with given author name  :--->" + JsonResponse);

    }


    @Test
    public void Api_Search_Repositories_Thru_Author_Name_With_Specific_Language() throws UnsupportedEncodingException {


        String JsonResponse = given()
                .accept(ContentType.JSON)
                .param("q", URLDecoder.decode(getReader().getQuery(), "UTF-8"))
                .when()
                .get(getReader().getSearchApiEndPoint())
                .thenReturn()
                .asString();

        System.out.println("Api Response with given author name plus language :--->" + JsonResponse);

    }

    @Test
    public void Api_Search_Repositories_Thru_Author_Name_With_Specific_Language_And_Sort() throws UnsupportedEncodingException {

        String JsonResponse = given()
                .accept(ContentType.JSON)
                .param("q", URLDecoder.decode(getReader().getQuery(), "UTF-8"))
                .param("sort", getReader().getSort())
                .when()
                .get(getReader().getSearchApiEndPoint())
                .thenReturn()
                .asString();

        System.out.println("Api Response with given author name plus language and Sort :--->" + JsonResponse);
    }

    @Test
    public void Api_Search_Repositories_Thru_Author_Name_With_Specific_Language_Sort_And_Order() throws UnsupportedEncodingException {

        String JsonResponse = given()
                .accept(ContentType.JSON)
                .param("q", URLDecoder.decode(getReader().getQuery(), "UTF-8"))
                .param("sort", getReader().getSort())
                .param("order", getReader().getOrder())
                .when()
                .get(getReader().getSearchApiEndPoint())
                .thenReturn()
                .asString();

        System.out.println("Api Response with given author name plus language, Sort and Order :--->" + JsonResponse);
    }

    @Test
    public void Api_Search_Repositories_Thru_Author_Name_With_Specific_Language_Sort_Order_And_PageNumber() throws UnsupportedEncodingException {

        String JsonResponse = given()
                .accept(ContentType.JSON)
                .param("q", URLDecoder.decode(getReader().getQuery(), "UTF-8"))
                .param("sort", getReader().getSort())
                .param("order", getReader().getOrder())
                .param("page", Integer.parseInt(getReader().getPageNumber()))
                .when()
                .get(getReader().getSearchApiEndPoint())
                .thenReturn()
                .asString();

        System.out.println("Api Response with given author name plus language, Sort, Order and given page number :--->" + JsonResponse);
    }

    @Test
    public void Api_Search_Repositories_Thru_Author_Name_With_Specific_Language_Sort_Order_PageNumber_And_PerPageList() throws UnsupportedEncodingException {
        String JsonResponse = given()
                .accept(ContentType.JSON)
                .param("q", URLDecoder.decode(getReader().getQuery(), "UTF-8"))
                .param("sort", getReader().getSort())
                .param("order", getReader().getOrder())
                .param("page", Integer.parseInt(getReader().getPageNumber()))
                .param("per_page", Integer.parseInt(getReader().getPerPageList()))
                .when()
                .get(getReader().getSearchApiEndPoint())
                .thenReturn()
                .asString();

        System.out.println("Api Response with given author name plus language, Sort, Order and given page number with per page list :--->" + JsonResponse);
    }


}
