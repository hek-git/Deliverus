package kau.coop.deliverus.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RegisterDto {

    private String nickname;
    private String userid;
    private String passwd;

    public RegisterDto(String nickname, String userid, String passwd) {
        this.nickname = nickname;
        this.userid = userid;
        this.passwd = passwd;
    }
}