package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspects {


    @Before("aop.aspects.MyPointCuts.allAddMethods())")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: проверка прав на получени книги или журнала");
        System.out.println("------------------------------------------------");
    }
}
