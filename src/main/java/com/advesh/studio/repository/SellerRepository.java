package com.advesh.studio.repository;

import com.advesh.studio.model.Seller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller,Integer>{
    
    
    @Procedure(procedureName = "CHECK_LOGIN", outputParameterName = "o_loginFlag ")
    int login(@Param("i_username") String i_username,@Param("i_password") String i_password);
}
