package com.example.Tienda.controllers;

import com.example.Tienda.models.proveedoresModel;
import com.example.Tienda.services.proveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/proveedores")
public class proveedoresController {
    @Autowired
    private proveedoresService proveedoresService;

    // create or update
    @PostMapping
    public void saveupdate(@RequestBody proveedoresModel proveedoresModel){
        proveedoresService.saveOrUpdate(proveedoresModel);
    }

    // read
    @GetMapping
    public List<proveedoresModel> getAllProveedores(){
        return proveedoresService.getProveedores();
    }

    //read by id
    @GetMapping("/{proveedorId}")
    public Optional<proveedoresModel> getProveedorById(@PathVariable("proveedorId") Long proveedorId){
        return proveedoresService.getProveedor(proveedorId);
    }

    //delete
    @DeleteMapping("/{proveedorId}")
    public void deleteproveedor(@PathVariable("proveedorId") Long proveedorId){
        proveedoresService.deleteProveedor(proveedorId);
    }
}
