package com.hellotaek.springdemo;

import javax.swing.text.AsyncBoxView;

public class MainApp {
    public static void main(String[] args) {
        //객체 생성
        Translator translator = new ChineseTranslator();
        //메소드 호출
        System.out.println(translator.sayHello());

    }
}
