package com.mindmate.mindmate_server.user.dto;

import com.mindmate.mindmate_server.user.domain.RoleType;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProfileResponse {
    private Long id;
    private String nickname;
    private RoleType role;
    private String message;

    public static ProfileResponse of(Long id, String nickname, RoleType role, String message) {
        return ProfileResponse.builder()
                .id(id)
                .nickname(nickname)
                .role(role)
                .message(message)
                .build();
    }
}
