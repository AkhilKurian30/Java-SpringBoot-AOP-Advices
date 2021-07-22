package com.javatpoint.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {

    // @Before(value="execution(* com.javatpoint.service.EmployeeService.*(..)) and
    // args(empId,fname,sname)")
    // public void beforeAdvice(JoinPoint joinPoint,String empId,String fname,String
    // sname){
    // System.out.println("Before Method :: "+joinPoint.getSignature());
    // }

    // @After(value="execution(* com.javatpoint.service.EmployeeService.*(..)) and
    // args(empId,fname,sname)")
    // public void afterAdvice(JoinPoint joinPoint,String empId,String fname,String
    // sname){
    // System.out.println("After Method :: "+joinPoint.getSignature());
    // }

    // @AfterReturning(value = "execution(*
    // com.javatpoint.service.EmployeeService.*(..)) and args(empId,fname,sname)")
    // public void afterReturnAdvice(JoinPoint joinPoint, String empId, String
    // fname, String sname) {
    // System.out.println("After Returning :: " + joinPoint.getSignature());
    // }

    // @AfterThrowing(value = "execution(*
    // com.javatpoint.service.EmployeeService.*(..))",throwing = "ex")
    // public void afterthrowingAdvice(JoinPoint joinPoint, Exception ex) {
    // System.out.println("After Exception :: " + joinPoint.getSignature());
    // }

    @Pointcut(value = "execution(* com.javatpoint.service.EmployeeService.*(..))")
    private void logaround() {
    }

    @Around(value = "logaround()")
    public void aroundAdvice(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("Before Returning :: " + jp.getSignature().getName());
        try {
            jp.proceed();
        } finally {

        }
        System.out.println("After Returning :: " + jp.getSignature().getName());
    }

}
