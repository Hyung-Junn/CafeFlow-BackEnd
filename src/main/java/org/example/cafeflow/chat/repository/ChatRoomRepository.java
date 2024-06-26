package org.example.cafeflow.chat.repository;

import org.example.cafeflow.chat.domain.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {
    Optional<ChatRoom> findById(Long id);
    List<ChatRoom> findByCafeOwnerId(Long cafeOwnerId);
    List<ChatRoom> findByUserId(Long userId);
    Optional<ChatRoom> findByCafeOwnerIdAndUserId(Long cafeOwnerId, Long userId);
}
