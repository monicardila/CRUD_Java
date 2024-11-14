package com.example.Tienda.repositories;

import com.example.Tienda.models.proveedoresModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUproveedores extends JpaRepository<proveedoresModel, Long> {
}
