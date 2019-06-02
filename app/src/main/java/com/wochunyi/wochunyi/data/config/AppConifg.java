package com.wochunyi.wochunyi.data.config;

/**
 * @author wochunyi
 * @date 2019-05-31.
 * GitHub：https://github.com/13570524658
 * app 配置
 */
public class AppConifg {
    //app名称
    public static String APP_NAME = "wochunyi";
    //0:正式环境，1:开发环境，2:测试环境
    public static int CONNECT_TYPE = 1;
    //正式环境
    public static String BASE_URL = "http://test-kxc.ruixiude.com:80/o2o-test/api/suser/login";
    //开发环境
    public static String DEV_BASE_URL = "http://test-kxc.ruixiude.com:20099/o2o/api/";
    //测试环境
    public static String TEST_BASE_URL = "http://test-kxc.ruixiude.com:20098/o2o-test/api/";
}
