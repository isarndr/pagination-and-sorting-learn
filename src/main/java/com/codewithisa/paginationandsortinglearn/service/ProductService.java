package com.codewithisa.paginationandsortinglearn.service;

import com.codewithisa.paginationandsortinglearn.entity.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {
    void initDB();
    List<Product> findAllProducts();
    List<Product> findProductsWithSorting(String field);
    Page<Product> findProductsWithPagination(int offset, int pageSize);
    Page<Product> findProductsWithPaginationAndSorting(int offset,int pageSize,String field);
}
