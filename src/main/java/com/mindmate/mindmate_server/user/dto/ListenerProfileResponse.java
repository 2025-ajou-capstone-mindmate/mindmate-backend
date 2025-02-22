package com.mindmate.mindmate_server.user.dto;

import com.mindmate.mindmate_server.user.domain.Badge;
import com.mindmate.mindmate_server.user.domain.CounselingField;
import com.mindmate.mindmate_server.user.domain.CounselingStyle;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
public class ListenerProfileResponse extends BaseProfileResponse {
    private List<CounselingField> counselingFields;
    private CounselingStyle counselingStyle;
    private Integer avgResponseTime;
    private String availableTimes;
    private Badge badgeStatus;
}

