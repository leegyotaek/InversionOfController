package com.hellotaek.springdemo;

    public class JapaneseTranslator implements Translator {
        @Override
        public String sayHello() {
            return "こんにちは";
        }
    }
