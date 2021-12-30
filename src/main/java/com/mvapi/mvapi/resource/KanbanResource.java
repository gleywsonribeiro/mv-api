package com.mvapi.mvapi.resource;

import com.mvapi.mvapi.domain.Kanban;
import com.mvapi.mvapi.repository.KanbanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kanban")
public class KanbanResource {

    @Autowired
    private KanbanRepository repository;

    @GetMapping()
    public List<Kanban> listar() {
        return repository.findAll();
    }
}
