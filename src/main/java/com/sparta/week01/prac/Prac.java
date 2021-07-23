package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac {

    // public, static void 에 대해서는 곧 배웁니다! 우선은 넘어갈게요.
    public static void printInfo() {
        String title = "웹개발의 봄 Spring";
        String tutor = "남병관";
        int weeks = 5;
        float ratings = 5.0f;

        System.out.println("제목: " + title);
        System.out.println("튜터: " + tutor);
        System.out.println("주차: " + weeks);
        System.out.println("별점: " + ratings);
    }

    //static : main 메소드 안에서 뭔가를 실행하려면 붙여줘야하는 표시!
    // 파라미터 X, 반환값 X
    public static void simplePrint() {
        System.out.println("파라미터도 없고, 반환값도 없어요!");
    }
    // 파라미터 O, 반환값 X
    public static void simpleSum(int num1, int num2) {
        System.out.println("num1 :" + num1 + ", num2: " + num2);
    }
    // 파라미터 X, 반환값 O
    public static int simpleReturn() {
        return 3;
    }
    // 파라미터 O, 반환값 O
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // 메인 안에서 작성해야 제대로 작동!
    public static void main(String[] args) {
        //System.out.println("안녕, 스파르타!");        // 단축키 : sout 탭키

        /*int a = 7;
        int b = 3;
        float c = 3.7f;
        Long d = 10000000000L;
        String myName = "지예";

        System.out.println(a + b);*/

        /*int myAge = 20;
        boolean isAdult = myAge > 20;
        boolean isKid = myAge <= 20;

        System.out.println(isAdult);
        System.out.println(isKid);
        System.out.println(myAge == 20);    // true
        System.out.println(myAge != 20);    // false*/

        /*List<String> myList = new ArrayList<>();
        String course1 = "웹개발의 봄 Spring";
        String course2 = "프론트엔드의 꽃 React";
        myList.add(course1);
        myList.add(course2);
        System.out.println(myList);
        System.out.println(myList.get(1));
        myList.remove(1);
        System.out.println(myList);*/

        /*List<String> courseList = new ArrayList<>();
        String course1 = "웹개발 종합반";
        String course2 = "앱개발 종합반";
        courseList.add(course1);
        courseList.add(course2);
        System.out.println(courseList);*/

        /*String title = "웹개발의 봄 Spring";
        String tutor = "남병관";
        int weeks = 5;
        float ratings = 5.0f;
        System.out.println("제목: " + title);
        System.out.println("튜터: " + tutor);
        System.out.println("주차: " + weeks);
        System.out.println("별점: " + ratings);*/

        //printInfo();

//        simplePrint();
//        simpleSum(1, 2);
        /*int ret = simpleReturn();
        System.out.println(ret);*/

        /*String title = "웹개발의 봄, Spring";
        String tutor = "남병관";
        int days = 35;
        Course course = new Course();
        course.setTitle(title);
        course.setTutor(tutor);
        course.setDays(days);
        System.out.println(course.getTitle());
        System.out.println(course.getTutor());*/

        /*Course course2 = new Course();
        course2.title = "프론트엔드의 꽃, React";
        course2.tutor = "임민영";
        System.out.println(course2.title);
        System.out.println(course2.tutor);*/

        /*Course course = new Course();
        System.out.println(course.title);
        System.out.println(course.tutor);
        System.out.println(course.days);
        Course course2 = new Course("웹개발의 봄 스프링", "남병관", 35);
        System.out.println(course2.title);
        System.out.println(course2.tutor);
        System.out.println(course2.days);*/

    }

}
