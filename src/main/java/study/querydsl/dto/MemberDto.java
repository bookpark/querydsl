package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // Querydsl에서 기본 생성자를 호출해야하기 떄문에 선언
public class MemberDto {

    private String username;
    private int age;

    @QueryProjection // DTO도 Q파일 생성 가능
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }

}
