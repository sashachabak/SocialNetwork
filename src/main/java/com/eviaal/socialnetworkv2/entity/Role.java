package com.eviaal.socialnetworkv2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
public enum Role {
    USER(Set.of(Permission.DEVELOPERS_READ,
                Permission.DEVELOPERS_WRITE)),
    ADMIN(Set.of(Permission.DEVELOPERS_READ,
                Permission.DEVELOPERS_WRITE,
                Permission.DEVELOPERS_UPDATE,
                Permission.DEVELOPERS_DELETE));

    private final Set<Permission> permissions;

    public Set<SimpleGrantedAuthority> getAuthorities() {
        return getPermissions().stream().map(
                permission -> new SimpleGrantedAuthority(permission.getPermission())).collect(Collectors.toSet());
    }
}
