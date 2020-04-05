package com.hellotaek.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfMainApp {
    public static void main(String[] args) {

        // 스프링 설정 파일 가져오기
        AnnotationConfigApplicationContext context =
                 new AnnotationConfigApplicationContext(LanConfig.class);

        // 어노테이션 방식으로 빈 가져오기
        Translator translator2 = context.getBean("jpTranslator", Translator.class);

        // bean의 메소드 호출
        System.out.println(translator2.sayHello());

        // close the context
        context.close();
    }
}
