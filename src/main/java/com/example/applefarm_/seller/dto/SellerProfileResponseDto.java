package com.example.applefarm_.seller.dto;

import com.example.applefarm_.user.entitiy.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor(force = true, access = AccessLevel.PROTECTED)
public class SellerProfileResponseDto {
    private final Long sellerId;
    private final String sellerNickname;
    private final String sellerImage;
    private final String sellerDetails;
    private final String sellerCategory;

    public SellerProfileResponseDto(User user) {
        this.sellerId = user.getId();
        this.sellerNickname = user.getSellerNickname();
        this.sellerImage = user.getSellerImage();
        this.sellerDetails = user.getSellerDetails();
        this.sellerCategory = user.getSellerCategory();
    }
}