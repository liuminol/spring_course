package com.psvmchannel.springaop.aop;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(* com.psvmchannel.springaop.service.BookService.get*(..))")
    public void allGetMethods() {}

    @Pointcut("execution(* com.psvmchannel.springaop.service.BookService.add*(..))")
    public void allAddMethods() {}
}
