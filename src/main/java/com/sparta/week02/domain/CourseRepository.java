package com.sparta.week02.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/*
CourseRepository : SQL의 역할을 대신 함.
extends : 상속, 다른 기능을 내가 가져와서 이용(뒤에 있는 기능을 가져와서 쓰겠다)
JPA : 자바로 DB를 사용하도록 도와줌
    Table -> Domain
    SQL(Structured Query Language) -> Repository
JpaRepository<Course, Long> : Course(class)라는 얘고, Id의 형태가 Long이다.
Interface : JPA를 사용하는 방법, 클래스에서 멤버가 빠진 메소드 모음집
*/

public interface CourseRepository extends JpaRepository<Course, Long> {
}
