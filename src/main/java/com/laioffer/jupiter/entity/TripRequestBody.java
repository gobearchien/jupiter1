package com.laioffer.jupiter.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FavoriteRequestBody {
    private final Location favoriteLocation;

    @JsonCreator
    public FavoriteRequestBody(@JsonProperty("favorite") Location favoriteLocation) {
        this.favoriteLocation = favoriteLocation;
    }

    public Location getFavoriteLocation() {
        return favoriteLocation;
    }

}
