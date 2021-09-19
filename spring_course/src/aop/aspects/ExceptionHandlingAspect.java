package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice() {
        System.out.println("Ловим/обрабатываем исключение при попытке получить книгу или журнал");
    }
}
