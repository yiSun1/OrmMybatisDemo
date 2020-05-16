package com.xiaoshu.mybatis.demo.v1;

import java.lang.reflect.Proxy;
import java.util.ResourceBundle;

public class Configuration {

    public static ResourceBundle sqlMapping;

    static {
        sqlMapping=ResourceBundle.getBundle("sql");
    }

    public <T> T getMapper(Class<T> tClass,SqlSession sqlSession) {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class[]{tClass},new MapperProxy(sqlSession));
    }
}
