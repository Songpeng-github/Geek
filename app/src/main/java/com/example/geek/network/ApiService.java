package com.example.geek.network;



import com.example.geek.bean.BannerBean;
import com.example.geek.bean.FirstBean;
import com.example.geek.bean.NoticeAuctionBean;
import com.example.geek.bean.ProceedAuctionBean;
import com.example.geek.bean.TwoBean;
import com.example.geek.login.bean.CheckBean;
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


    //登录，验证码，找回密码，校验验证码，注册接口
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

         @POST("checkLMsgCode")
         @Headers("Content-Type:application/json")
         Observable<CheckBean>   getCheck(@Body RequestBody body);

        @POST("registerPhone")
        @Headers("Content-Type:application/json")
        Observable<RegisterBean>   getRegister(@Body RequestBody body);

        //首页banner轮播图 ，查询正在拍卖列表,查询即将拍卖的列表,一级经营范围,二级经营范围
        @POST("auctionQueryBanners")
        @Headers("Content-Type:application/json")
         Observable<BannerBean>   HomeBanner(@Body RequestBody body);

       @POST("queryProceedAuction")
       @Headers("Content-Type:application/json")
       Observable<ProceedAuctionBean>   getProceed(@Body RequestBody Body);

       @POST("queryNoticeAuction")
       @Headers("Content-Type:application/json")
       Observable<NoticeAuctionBean>     getHotice(@Body RequestBody body);

       @POST("queryFirstEnteritem")
       @Headers("Content-Type:application/json")
       Observable<FirstBean>  getFirst(@Body RequestBody body);

       @POST("querTwoEnteritem")
       @Headers("Content-Type:application/json")
      Observable<TwoBean>  getTwo(@Body RequestBody body);




















}
