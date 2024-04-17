package com.talenthub.admin_tools_canela.repository;

import com.talenthub.admin_tools_canela.model.canelauser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Canelauser_repository extends JpaRepository<canelauser, Long> {
}
