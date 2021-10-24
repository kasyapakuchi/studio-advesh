package com.advesh.studio.service;

import java.util.Map;

import com.advesh.studio.model.Seller;
import com.advesh.studio.repository.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginService {

    @Autowired   
    SellerRepository sellerRepository;

    public int login(Map<String, String> seller) {
        return sellerRepository.login(seller.get("username"), seller.get("password"));
    }

}
