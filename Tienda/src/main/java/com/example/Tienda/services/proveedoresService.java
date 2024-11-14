package com.example.Tienda.services;


import com.example.Tienda.models.proveedoresModel;
import com.example.Tienda.repositories.IUproveedores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class proveedoresService {
    @Autowired
    IUproveedores IUproveedores;
    // create or update
    public void saveOrUpdate(proveedoresModel proveedoresModel){
        IUproveedores.save(proveedoresModel);
    }
    // read
    public List<proveedoresModel> getProveedores(){
        return IUproveedores.findAll();
    }
    // read by id
    public Optional<proveedoresModel> getProveedor(long id){
         return IUproveedores.findById(id);
    }
    //delete by id
    public void deleteProveedor(long id){
        IUproveedores.deleteById(id);
    }

}
