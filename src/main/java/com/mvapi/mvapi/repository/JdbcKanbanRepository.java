package com.mvapi.mvapi.repository;

import com.mvapi.mvapi.domain.Kanban;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class JdbcKanbanRepository implements KanbanRepository {
    @Autowired
    private JdbcTemplate template;

    @Override
    public List<Kanban> findAll() {
        return template.query(
                "select * from kanban",
                (rs, rowNum) -> new Kanban(
                        rs.getString("paciente"),
                        rs.getString("cor"),
                        rs.getDate("classificacao"),
                        rs.getDate("fau"),
                        rs.getLong("cd_atendimento")
                )
        );
    }

    @Override
    public Optional<Kanban> findById(Long id) {
        return Optional.empty();
    }
}
