package com.xiaoshu.mybatis.demo;

import com.xiaoshu.mybatis.demo.domain.Blog;
import com.xiaoshu.mybatis.demo.mapper.BlogMapper;

public class main {
    public static void main(String[] args) {
         SqlSession sqlSession=new SqlSession(new Configuration(),new Executor());
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = mapper.selectOne(1);
        System.out.printf(blog.toString());
    }
}
