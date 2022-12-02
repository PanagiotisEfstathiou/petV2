package com.edu.petv2.controller;

import com.edu.petv2.model.Account;
import com.edu.petv2.model.Owner;
import com.edu.petv2.repository.OwnerRepository;
import com.edu.petv2.service.BaseService;
import com.edu.petv2.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("Owners")
public class OwnerController extends AbstractController<Owner> {

   private OwnerService ownerService;
    private OwnerRepository ownerRepository;
    @Override
    protected BaseService<Owner> getBaseService() {
        return ownerService;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/getAll")
    public List<Owner> getAccounts(){
        return this.ownerService.findAll();
    }

    @PostMapping("/new")
    public ResponseEntity<Owner> createTutorial(@RequestBody Owner owner) {
        try {
            Owner _owner;
            _owner = ownerRepository
                    .save(new Owner( owner.getPassword(),owner.getMail() ,owner.getName() ));
            return new ResponseEntity<>(_owner, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
