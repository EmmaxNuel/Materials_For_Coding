package com.order_service.order_service.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
public class OrderItem {

    private UUID id;
    private UUID orderId;
    private UUID productId;
    private int quantity;
    private long unitPrice;
}
