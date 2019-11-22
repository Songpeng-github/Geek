package com.example.geek.network;



import com.example.geek.login.bean.ForgetBean;
import com.example.geek.login.bean.LoginBean;
import com.example.geek.login.bean.RegisterBean;
import com.example.geek.login.bean.ResetBean;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;

import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:18:00
 */
public interface ApiService {
       // https://www.quepai.cn/

    //登录，验证码，找回密码，手机号注册接口
        String sBaseUrl="https://www.quepai.cn/";
        @POST("loginUser")
        @Headers("Content-Type:application/json")
        Observable<LoginBean> getlogin(@Body RequestBody body);



        @POST("sendMsg")
        @Headers("Content-Type:application/json")
       Observable<ForgetBean> getForget(@Body RequestBody body);


        @POST("retrievePwd")
        @Headers("Content-Type:application/json")
        Observable<ResetBean> getReset(@Body RequestBody body);

        @POST("registerPhone")
        @Headers("Content-Type:application/json")
        Observable<RegisterBean>   getRegister(@Body RequestBody body);











}
