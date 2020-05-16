package com.xiaoshu.mybatis.demo.v1;

import com.xiaoshu.mybatis.demo.v1.domain.Blog;
import com.xiaoshu.mybatis.demo.v1.mapper.BlogMapper;

public class main {
    public static void main(String[] args) {
         SqlSession sqlSession=new SqlSession(new Configuration(),new Executor());
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = mapper.selectOne(1);
        System.out.printf(blog.toString());
    }
}
