package com.mvapi.mvapi.repository;

import com.mvapi.mvapi.domain.Kanban;

import java.util.List;
import java.util.Optional;

public interface KanbanRepository {

    List<Kanban> findAll();
    Optional<Kanban> findById(Long id);

}
