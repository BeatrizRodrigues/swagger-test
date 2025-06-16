package com.example.models;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RecurringDataFrequencyOneOf
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = DeadlineFrequency.class, name = "DeadlineFrequency"),
        @JsonSubTypes.Type(value = QuantityFrequency.class, name = "QuantityFrequency")
})
@Schema(name = "RecurringDataFrequencyOneOf",
        oneOf = {DeadlineFrequency.class, QuantityFrequency.class})
public interface RecurringDataFrequencyOneOf {
}