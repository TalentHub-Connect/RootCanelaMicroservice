package com.talenthub.admin_tools_canela.service;

import com.talenthub.admin_tools_canela.model.canelauser;
import com.talenthub.admin_tools_canela.repository.Canelauser_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Canelauser_Service {

    @Autowired
    private Canelauser_repository canelauser_repository;

    public Iterable<canelauser> getAllCanelaUsers(){
        return canelauser_repository.findAll();
    }

    @Transactional
    public canelauser createUser(canelauser c){
        return canelauser_repository.save(c);
    }

}
