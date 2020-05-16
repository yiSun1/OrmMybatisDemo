package com.xiaoshu.mybatis.demo.v1;

public class SqlSession {
    private Configuration configuration;
    private Executor executor;

    public SqlSession(Configuration configuration, Executor executor) {
        this.configuration = configuration;
        this.executor = executor;
    }

    public <T> T selectOne(String statementId, Object param) {
        String sql = configuration.sqlMapping.getString(statementId);
        return executor.query(sql, param);
    }

    public <T> T getMapper(Class<T> tClass){
        return configuration.getMapper(tClass,this);
    }

}
