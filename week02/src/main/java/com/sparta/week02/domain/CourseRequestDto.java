// DTO : 테이블을 막 건드리고 다니면 안됨(다른 사람이 변경할 수도 있으니까) -> 완충재로 사용하는 게 DTO -> 데이터를 몰고 다니도록

package com.sparta.week02.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class CourseRequestDto {
    private final String title;
    private final String tutor;
}
