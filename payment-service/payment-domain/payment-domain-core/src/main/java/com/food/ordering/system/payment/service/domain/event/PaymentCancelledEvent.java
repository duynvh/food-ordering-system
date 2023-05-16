package com.food.ordering.system.payment.service.domain.event;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.payment.service.domain.entity.Payment;

import java.time.ZonedDateTime;
import java.util.Collections;

public class PaymentCancelledEvent extends PaymentEvent {
    private final DomainEventPublisher<PaymentCancelledEvent> paymentEventPublisher;
    public PaymentCancelledEvent(Payment payment,
                                 ZonedDateTime createdAt,
                                 DomainEventPublisher<PaymentCancelledEvent> paymentEventPublisher) {
        super(payment, createdAt, Collections.emptyList());
        this.paymentEventPublisher = paymentEventPublisher;
    }


    @Override
    public void fire() {
        paymentEventPublisher.publish(this);
    }
}
