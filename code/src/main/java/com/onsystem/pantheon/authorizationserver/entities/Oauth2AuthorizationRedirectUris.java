package com.onsystem.pantheon.authorizationserver.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "oauth2_authorization_redirect_uris")
public class Oauth2AuthorizationRedirectUris {
    @EmbeddedId
    private Oauth2AuthorizationRedirectUrisId id;

    @MapsId("id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private Oauth2RegisteredClient id1;

}