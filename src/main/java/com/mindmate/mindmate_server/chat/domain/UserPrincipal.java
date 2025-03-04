package com.mindmate.mindmate_server.chat.domain;

import java.security.Principal;

public class UserPrincipal implements Principal {
    private final Long userId;

    public UserPrincipal(Long userId) {
        this.userId = userId;
    }

    @Override
    public String getName() {
        return userId.toString();
    }

    public Long getUserId() {
        return userId;
    }
}
