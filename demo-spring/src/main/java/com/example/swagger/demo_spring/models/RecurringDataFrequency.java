package com.example.swagger.demo_spring.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Getter
@lombok.Setter
@lombok.experimental.SuperBuilder(toBuilder = true)
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.ToString
@lombok.EqualsAndHashCode
@Schema(name = "")
@jakarta.annotation.Generated(value = "arch.codegen.ArchSpringCodegen", date = "2025-06-16T08:52:58.735583500-03:00[America/Sao_Paulo]")
@com.fasterxml.jackson.annotation.JsonTypeName("RecurringDataFrequency")
public class RecurringDataFrequency {
    @Schema(implementation = RecurringDataFrequencyOneOf.class, title = "OneOf", requiredMode = Schema.RequiredMode.NOT_REQUIRED

            , oneOf = {DeadlineFrequency.class, QuantityFrequency.class}
    )

    @JsonProperty("oneOf")
    @lombok.Builder.Default

    private RecurringDataFrequencyOneOf oneOf = null;
}
