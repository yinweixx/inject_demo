package com.template.guice;

import com.google.inject.AbstractModule;

public class CommentModule extends AbstractModule{
    @Override
    protected void configure() {
        bind(CommentService.class).to(CommentServiceImpl.class);
    }
}
