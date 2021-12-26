package com.example.springcqrsbankaccountmanagement.queries.services;

import org.axonframework.eventsourcing.eventstore.DomainEventStream;


public interface EventSourcingService {
  DomainEventStream eventsByAccountId(String accountId);
}
