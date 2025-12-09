package services;

import models.Producto;

import java.util.Arrays;
import java.util.List;

public class ProductServiceImplement implements ProductoService {

    @Override
    public List<Producto> listar() {
        return Arrays.asList(new Producto(1L, "Laptop","computacion", precio: 250.25),
        new Producto(2L,"refrigeradora", "cocina", precio:745.13),
        new Producto(3L, "cama", "ddomirtorio", precio:350.12));
    }
}
