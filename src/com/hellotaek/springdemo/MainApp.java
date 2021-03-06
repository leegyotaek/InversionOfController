package com.hellotaek.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.tools.java.ClassPath;

import javax.swing.text.AsyncBoxView;

public class MainApp {
    public static void main(String[] args) {

        // 스프링 설정 파일 가져오기
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // 스프링 컨테이너에서 빈 얻어오기
        Translator translator = context.getBean("myTranslator", Translator.class);

        // bean의 메소드 호출
        System.out.println(translator.sayHello());


        // 어노테이션 방식으로 빈 가져오기
        Translator translator2 = context.getBean("jpTranslator", Translator.class);

        // bean의 메소드 호출
        System.out.println(translator2.sayHello());

        // close the context
        context.close();
    }
}
