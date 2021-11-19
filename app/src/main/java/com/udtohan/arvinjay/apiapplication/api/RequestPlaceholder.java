package com.udtohan.arvinjay.apiapplication.api;

import com.udtohan.arvinjay.apiapplication.pojos.Login;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestPlaceholder {

    @POST("login")
    Call<Login> Login(@Body Login login);
}
