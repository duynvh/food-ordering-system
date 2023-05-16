package com.food.ordering.system.payment.service.domain.event;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.payment.service.domain.entity.Payment;

import java.time.ZonedDateTime;
import java.util.List;

public class PaymentFailedEvent extends PaymentEvent {
    private final DomainEventPublisher<PaymentFailedEvent> paymentEventPublisher;
    public PaymentFailedEvent(Payment payment, ZonedDateTime createdAt, List<String> failureMessages, DomainEventPublisher<PaymentFailedEvent> paymentEventPublisher) {
        super(payment, createdAt, failureMessages);
        this.paymentEventPublisher = paymentEventPublisher;
    }

    @Override
    public void fire() {
        paymentEventPublisher.publish(this);
    }
}
