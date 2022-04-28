package com.example.catalogservice.service;

import com.example.catalogservice.jpa.CatalogEntity;
import com.example.catalogservice.jpa.CatalogRepositoy;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Slf4j
@Service
public class CatalogServiceImpl implements CatalogService{

    CatalogRepositoy catalogRepositoy;

    @Autowired
    public CatalogServiceImpl(CatalogRepositoy catalogRepositoy) {
        this.catalogRepositoy = catalogRepositoy;
    }

    @Override
    public Iterable<CatalogEntity> getAllCalogs() {
        return catalogRepositoy.findAll();

    }
}
