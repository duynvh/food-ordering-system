package com.food.ordering.system.order.service.domain.event;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderCancelledEvent extends OrderEvent {
    private final DomainEventPublisher<OrderCancelledEvent> orderEventPublisher;
    public OrderCancelledEvent(Order order, ZonedDateTime createdAt, DomainEventPublisher<OrderCancelledEvent> orderEventPublisher) {
        super(order, createdAt);
        this.orderEventPublisher = orderEventPublisher;
    }

    @Override
    public void fire() {
        orderEventPublisher.publish(this);
    }
}
