package com.weiqigao.foo;

import javax.annotation.PostConstruct;
import javax.annotation.Nonnull;

public class Foo {
    @PostConstruct
    @Nonnull
    public String doIt() {
        System.out.println("com.weiqigao.foo.Foo::doIt() called.");
        return "Hello";
    }
}
