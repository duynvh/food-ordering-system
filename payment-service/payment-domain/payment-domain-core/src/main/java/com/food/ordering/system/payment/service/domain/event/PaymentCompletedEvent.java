package com.food.ordering.system.payment.service.domain.event;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.payment.service.domain.entity.Payment;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

public class PaymentCompletedEvent extends PaymentEvent {
    private final DomainEventPublisher<PaymentCompletedEvent> paymentEventPublisher;
    public PaymentCompletedEvent(Payment payment, ZonedDateTime createdAt, DomainEventPublisher<PaymentCompletedEvent> paymentEventPublisher) {
        super(payment, createdAt, Collections.emptyList());
        this.paymentEventPublisher = paymentEventPublisher;
    }

    @Override
    public void fire() {
        paymentEventPublisher.publish(this);
    }
}
