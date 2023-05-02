package study.querydsl.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // Querydsl에서 기본 생성자를 호출해야하기 떄문에 선언
public class MemberDto {

    private String username;
    private int age;

    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }

}
