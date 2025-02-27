package com.mindmate.mindmate_server.chat.service;

import com.mindmate.mindmate_server.chat.domain.ChatRoom;
import com.mindmate.mindmate_server.chat.dto.ChatRoomDetailResponse;
import com.mindmate.mindmate_server.chat.dto.ChatRoomResponse;
import com.mindmate.mindmate_server.user.domain.RoleType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface ChatRoomService {
    // 채팅방 조회

    ChatRoom findChatRoomById(Long roomId);
    Page<ChatRoomResponse> getChatRoomsForUser(Long userId, PageRequest pageRequest);
    Page<ChatRoomResponse> getChatRoomsByUserRole(Long userId, PageRequest pageRequest, RoleType roleType);

    ChatRoomDetailResponse getChatRoomWithMessages(Long userId, Long roomId, PageRequest pageRequest);
    void closeChatRoom(Long userId, Long roomId);

}
