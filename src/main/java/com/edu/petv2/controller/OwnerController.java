package com.edu.petv2.controller;



import com.edu.petv2.controller.AbstractController;
import com.edu.petv2.model.Owner;
import com.edu.petv2.repository.OwnerRepository;
import com.edu.petv2.service.BaseService;
import com.edu.petv2.service.OwnerService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("Owners")
@CrossOrigin("*")
public class OwnerController extends AbstractController<Owner> {

    private final OwnerService ownerService;

    private final OwnerRepository ownerRepository;


    protected BaseService<Owner> getBaseService() {
        return ownerService;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("getAll")
    public List<Owner> getAccounts(){
        return this.ownerService.findAll();
    }

    @PostMapping("/new")
    public ResponseEntity<Owner> createTutorial(@RequestBody Owner owner) {
        try {
            Owner _owner = ownerRepository
                    .save(new Owner(owner.getName(), owner.getMail(), owner.getPassword()));
            return new ResponseEntity<>(_owner, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Body:
    //    {
    //        "name" : "alpha",
    //            "mail" : "pass1",
    //            "password" : "asdf"
    //    }




}
