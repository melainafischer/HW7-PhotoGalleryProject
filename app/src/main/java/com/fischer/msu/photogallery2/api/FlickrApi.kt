package com.fischer.msu.photogallery2.api

import retrofit2.http.GET

private const val API_KEY = "123cc205b92c5bb5b3c292e42dd22941"

interface FlickrApi {
    //@GET("/")

    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    suspend fun fetchPhotos():FlickrResponse
}