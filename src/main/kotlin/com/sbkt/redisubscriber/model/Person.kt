package com.sbkt.redisubscriber.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Person(@JsonProperty("personId") var personId: String,
             @JsonProperty("firstName") var firstName: String,
             @JsonProperty("lastName") var lastName: String,
             @JsonProperty("email") var email: String){}