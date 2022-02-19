package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspects2 {

    @Before("execution(* add*())")
    public void beforeAllAddMethods() {
        System.out.println("LOG#1");
    }

}
