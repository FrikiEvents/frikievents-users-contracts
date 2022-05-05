package com.frikiteam.frikievents.users.contracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class EditUser {
    @TargetAggregateIdentifier
    private String userId;
    private String firstName;
    private String lastName;
    private String type;
    private String description;
    private String verified;
}