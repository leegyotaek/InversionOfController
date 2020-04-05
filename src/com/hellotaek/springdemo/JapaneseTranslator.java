package com.hellotaek.springdemo;

import org.springframework.stereotype.Component;

@Component(value = "jpTranslator")
    public class JapaneseTranslator implements Translator {
        @Override
        public String sayHello() {
            return "こんにちは";
        }
    }
