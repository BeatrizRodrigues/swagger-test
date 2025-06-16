package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import io.swagger.v3.oas.annotations.media.Schema;

@Serdeable
@lombok.Getter
@lombok.Setter
@Introspected
@lombok.experimental.SuperBuilder(toBuilder = true)
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.ToString
@lombok.EqualsAndHashCode
@Schema(name = "RecurringDataFrequency")
@jakarta.annotation.Generated(value = "arch.codegen.ArchMicronautCodegen", date = "2025-06-16T08:25:43.960400900-03:00[America/Sao_Paulo]")
@com.fasterxml.jackson.annotation.JsonTypeName("RecurringDataFrequency")
public class RecurringDataFrequency {

    @Schema(name = "oneOf", title = "OneOf",
            implementation = RecurringDataFrequencyOneOf.class,
            requiredMode = Schema.RequiredMode.NOT_REQUIRED,
            oneOf = {DeadlineFrequency.class, QuantityFrequency.class})
    @JsonProperty("oneOf")
    @lombok.Builder.Default
    private RecurringDataFrequencyOneOf oneOf = null;
}
