package com.talenthub.admin_tools_canela.controller;

import com.talenthub.admin_tools_canela.model.canelauser;
import com.talenthub.admin_tools_canela.repository.Canelauser_repository;
import com.talenthub.admin_tools_canela.service.Canelauser_Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/canela")
public class CanelauserController {

    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private Canelauser_Service canelauserService;

    @Autowired
    private Canelauser_repository canelauser_repository;

    @CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8094"})
    @GetMapping("/getUsers")
    public Iterable<canelauser> getAllCanelaUsers(){
        return canelauserService.getAllCanelaUsers();
    }

    @CrossOrigin(origins = {"*"})
    @PostMapping("/usuarios")
    public ResponseEntity<?> postCreateCanelaUser(@RequestBody canelauser c){
        try {
            return new ResponseEntity<>(canelauserService.createUser(c),HttpStatus.CREATED);
        }catch (Exception e){
            return  ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
