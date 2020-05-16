package com.xiaoshu.mybatis.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MapperProxy implements InvocationHandler {

    private SqlSession sqlSession;

    public MapperProxy(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String mapperInterface=method.getDeclaringClass().getName();
        String methodName=method.getName();
        String statmentId=mapperInterface+"."+methodName;
        return sqlSession.selectOne(statmentId,args[0]);
    }
}
