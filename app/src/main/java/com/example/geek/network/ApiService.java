package com.example.geek.network;



import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * name:&{宋佳羿}
 * date:2019/11/19
 * Time:18:00
 */
public interface ApiService {
       // https://www.quepai.cn/loginUser





        String sBaseUrl="https://www.quepai.cn/loginUser";
        //登录接口
        @FormUrlEncoded
        @POST()
        Observable<RequestBody>  login(@Field("loginname") String name, @Field("password") String password);






}
