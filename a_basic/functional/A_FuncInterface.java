package com.multi.lambda.a_basic.functional;

public interface A_FuncInterface {
   // 매개변수와 반환값이 없는 추상메소드
    public void method();


//    public void method1();//-- @FunctionalInterface  작성하면 두개 이상의 추상메소드를 선언했을때 컴파일 에러발생

}

//public interface A_FuncInterface {
//    void printIt(String text);
//
//    default public void printUtf8To(String text){//디폴트메소드
//
//    }
//
//    static void printItToSystemOut(String text) {//정적메소드
//        System.out.println(text);
//    }
//}
