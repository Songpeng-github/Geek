package com.example.geek.network;



import com.example.geek.login.bean.LoginBean;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:18:00
 */
public interface ApiService {
       // https://www.quepai.cn/loginUser

        String sBaseUrl="https://www.quepai.cn/";



        @POST("loginUser")
        @Headers("Content-Type:application/json")
        Observable<LoginBean> getlogin(@Body RequestBody body);

}
