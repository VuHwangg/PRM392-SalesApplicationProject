package com.fpt.PRM392_FinalProject.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CartDTOUpdateRequest {
    private int cusID;
    private ArrayList<POST_Cart_Product_DTO> post_cart_dtos;
}
