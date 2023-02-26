package com.gfa.devops;

import com.gfa.devops.models.Author;
import com.gfa.devops.workers.Reception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v0/")
public class ApiController {
    private final Reception reception;

    @Autowired public ApiController(Reception reception) {
        this.reception = reception;
    }

    @PutMapping("author/")
    public ResponseEntity<?> author(@RequestBody Author author) {;
        return ResponseEntity.ok(this.reception.addAuthor(author));
    }
}
