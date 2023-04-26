package study.querydsl.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Team {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "team")
    @ToString.Exclude
    private List<Member> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

}
