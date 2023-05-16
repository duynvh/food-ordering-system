package com.food.ordering.system.order.service.domain.event;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderCreatedEvent extends OrderEvent {
    private final DomainEventPublisher<OrderCreatedEvent> orderEventPublisher;

    public OrderCreatedEvent(Order order, ZonedDateTime createdAt, DomainEventPublisher<OrderCreatedEvent> orderEventPublisher) {
        super(order, createdAt);
        this.orderEventPublisher = orderEventPublisher;
    }

    @Override
    public void fire() {
        orderEventPublisher.publish(this);
    }
}
