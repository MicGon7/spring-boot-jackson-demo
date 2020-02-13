package com.example.jacksonDemo

import com.fasterxml.jackson.annotation.JsonProperty

data class Address(
        @JsonProperty("street")
        val street: String,
        @JsonProperty("city")
        val city: String,
        @JsonProperty("state")
        val state: String,
        @JsonProperty("zip")
        val zip: String,
        @JsonProperty("country")
        val country: String
)
