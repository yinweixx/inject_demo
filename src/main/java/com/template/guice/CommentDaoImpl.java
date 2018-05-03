package com.template.guice;


public class CommentDaoImpl implements CommentDao{

    public CommentDaoImpl(){}

    public void comment(String message) {
        System.out.println(message);
    }
}
