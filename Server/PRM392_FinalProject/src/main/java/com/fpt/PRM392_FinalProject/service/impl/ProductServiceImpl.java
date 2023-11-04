package com.fpt.PRM392_FinalProject.service.impl;

import com.fpt.PRM392_FinalProject.dto.ProductDTOHomeResponse;
import com.fpt.PRM392_FinalProject.mapper.ProductMapper;
import com.fpt.PRM392_FinalProject.repository.ProductRepository;
import com.fpt.PRM392_FinalProject.service.ProductService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = false)
public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository;

    @Override
    public List<ProductDTOHomeResponse> getAllProduct() {
        return productRepository.findAll()
                .stream()
                .map(ProductMapper::toProductDTOHomeResponse)
                .collect(Collectors.toList());
    }
}