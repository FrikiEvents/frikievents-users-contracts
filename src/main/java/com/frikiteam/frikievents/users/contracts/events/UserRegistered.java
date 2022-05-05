package com.frikiteam.frikievents.users.contracts.events;

import lombok.Value;
import java.time.Instant;

@Value
public class UserRegistered {
    private String userId;
    private String firstName;
    private String lastName;
    private String type;
    private String description;
    private String verified;
    private Instant occurredOn;
}