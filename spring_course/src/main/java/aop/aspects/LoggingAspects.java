//package aop.aspects;
//
//
//import aop.Book;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.reflect.MethodSignature;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//@Order(1)
//public class LoggingAspects {
//
//
//
//    @Before("aop.aspects.MyPointCuts.allAddMethods()")
//    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
//
//         MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
//        System.out.println("methodSignature = " + methodSignature);
//        System.out.println("methodSignature.getMethod = " + methodSignature.getMethod());
//        System.out.println("methodSignature.getReturnType = " + methodSignature.getReturnType());
//        System.out.println("methodSignature.getName = " + methodSignature.getName());
//
//        if (methodSignature.getName().equals("addBook")) {
//            Object[] arguments = joinPoint.getArgs();
//            for (Object obj:arguments) {
//                if (obj instanceof Book) {
//                    Book myBook = (Book) obj;
//                    System.out.println("Информация о книге: название - " + myBook.getName() + ", автор - "
//                            + myBook.getAuthor() + ", год поблукации - " + myBook.getYearOfPublication());
//                } else if (obj instanceof String) {
//                    System.out.println("Книгу добавляет: " + obj);
//            }
//        }
//        }
//
//
//
//        System.out.println("beforeGetLoggingAdvice: логирование попытки получить книгу/журнал");
//        System.out.println("------------------------------------------------");
//    }
//
//
////     @Pointcut("execution(* aop.UniLibrary.*(..))")
////    private void allMethodsFromUniLibrary() {}
////
////    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
////    private void returnMagazineFromUniLibrary() {}
////
////    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
////    private void allMethodsInsteadOfReturnMagazine() {}
////
////    @Before("allMethodsInsteadOfReturnMagazine()")
////    public void beforeAllMethodsInsteadOfReturnMagazine() {
////        System.out.println("beforeAllMethodsInsteadOfReturnMagazine: LOG#3");
////    }
////
////    @Before("returnMagazineFromUniLibrary()")
////    public void beforeReturnMagazineFromUniLibrary() {
////        System.out.println("beforeReturnMagazineFromUniLibrary: LOG#2");
////    }
////
////    @Before("allMethodsFromUniLibrary()")
////    public void beforeAllMethodsFromUniLibrary() {
////        System.out.println("beforeAllMethodsFromUniLibrary: LOG#1");
////    }
//
////    @Pointcut("execution(* aop.UniLibrary.get*())")
////    private void allGetMethodsFromUniLibrary() {}
////
////    @Pointcut("execution(* aop.UniLibrary.return*())")
////    private void allReturnMethodsFromUniLibrary() {}
////
////    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
////    private void allGetAndReturnLoggingAdvice() {}
////
////@Before("allGetMethodsFromUniLibrary()")
////    public void beforeGetLoggingAdvice() {
////    System.out.println("beforeGetLoggingAdvice: writing Log#1");
////}
////
////@Before("allReturnMethodsFromUniLibrary()")
////    public void beforeReturnLoggingAdvice() {
////    System.out.println("beforeReturnLoggingAdvice: writing Log#2");
////}
////
////@Before("allGetAndReturnLoggingAdvice()")
////    public void beforeAllGetAndReturnLoggingAdvice() {
////    System.out.println("beforeAllGetAndReturnLoggingAdvice: writing Log#3");
////}
//
//
//
//
////    @Before("allGetMethods())")
////    public void beforeGetSecurityAdvice() {
////        System.out.println("beforeGetSecurityAdvice: проверка прав на получени книги или журнала");
////    }
//
////    @Before("execution(* return*())")
////    public void beforeReturnBookAdvice() {
////        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
////    }
//}
