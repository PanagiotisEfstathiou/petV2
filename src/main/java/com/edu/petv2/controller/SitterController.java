package com.edu.petv2.controller;

import com.edu.petv2.model.Owner;
import com.edu.petv2.model.Sitter;
import com.edu.petv2.repository.SitterRepository;
import com.edu.petv2.service.BaseService;
import com.edu.petv2.service.SitterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("Sitters")
public class SitterController extends AbstractController<Sitter> {
    private final SitterService sitterService;
    private final SitterRepository sitterRepository;


    @Override
    protected BaseService<Sitter> getBaseService() {
        return sitterService;
    }

    @PostMapping("/new")
    public ResponseEntity<Sitter> createTutorial(@RequestBody Sitter sitter) {
        try {
            Sitter _sitter = sitterRepository
                    .save(new Sitter(sitter.getName(), sitter.getMail(), sitter.getPassword()));
            return new ResponseEntity<>(_sitter, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //Body:
    //    {
    //        "name" : "alpha",
    //            "mail" : "pass2",
    //            "password" : "asdf"
    //    }
}
