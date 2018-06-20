package com.dalimao.mytaxi.splash.account.module;

import android.os.Handler;

/**
 * @Title:IAccountManager
 * @Package:com.dalimao.mytaxi.splash.account.module
 * @Description:负责与账户业务逻辑相关的抽象
 * @Auther:YJH
 * @Email:yuannunhua@gmail.com
 * @Date:2018/6/2014:07
 */
public interface IAccountManager {


    public static final int SMS_SEND_SUC = 1;
    public static final int SMS_SEND_FAIL = -1;
    public static final int SMS_CHECK_SUC = 2;
    public static final int SMS_CHECK_FAIL = -2;
    public static final int USER_EXIST = 3;
    public static final int USER_NOT_EXIST = -3;
    public static final int SMS_SERVER_FAIL = 100;

    public static final int LOGIN_SUC = 4;
    public static final int LOGIN_FAIL = -4;
    public static final int SERVER_FAIL = 5;
    public static final int PW_ERR = 6;

    public static final int REGISTER_SUC = 7;
    public static final int TOKEN_INVALID = 8;
    
    void setHandler(Handler handler);
    //发送验证码
    void fetchSMSCode(String phone);

    //校验验证码手机号
    void checkSnmCode(String phone, String smsCode);

    //验证用户手机号是否已注册
    void checkUserExist(String phone);

    //注册
    void register(String phone, String password);

    //登录
    void login(String phone, String password);

    //通过token登录
    void loginByToken();
}
