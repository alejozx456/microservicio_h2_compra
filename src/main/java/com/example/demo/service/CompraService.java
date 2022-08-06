package com.example.demo.service;

import com.example.demo.models.Compra;

import java.util.List;

public interface CompraService  {
    Compra saveCompra(Compra compra);

    List<Compra> findAllComprasOfUser(Long userId);
}
