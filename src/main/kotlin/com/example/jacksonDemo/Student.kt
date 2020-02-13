package com.example.jacksonDemo

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Student(
        @JsonProperty("id")
        val id: Int?,
        @JsonProperty("firstName")
        val firstName: String?,
        @JsonProperty("lastName")
        val lastName: String?,
        @JsonProperty("active")
        val active: Boolean?,
        @JsonProperty("address")
        val address: Address?,
        @JsonProperty("languages")
        val languages: List<String>?
)



