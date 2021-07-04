package com.eviaal.socialnetworkv2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

@AllArgsConstructor
@Getter
public enum Permission {
    DEVELOPERS_READ("developers:read"),
    DEVELOPERS_WRITE("developers:write"),
    DEVELOPERS_UPDATE("developers:update"),
    DEVELOPERS_DELETE("developers:delete");

    private final String permission;
}
