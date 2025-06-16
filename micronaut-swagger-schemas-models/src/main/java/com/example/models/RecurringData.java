package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

@Serdeable
@lombok.Getter
@lombok.Setter
@Introspected
@lombok.experimental.SuperBuilder(toBuilder = true)
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.ToString
@lombok.EqualsAndHashCode
@Schema(name = "RecurringData")
@jakarta.annotation.Generated(value = "arch.codegen.ArchMicronautCodegen", date = "2025-06-16T08:25:43.960400900-03:00[America/Sao_Paulo]")
@com.fasterxml.jackson.annotation.JsonTypeName("RecurringData")
public class RecurringData {
    @Schema(name = "scheduleName", example = "condominium",
            description = """
            Name of the recurring schedule.
            """,
            implementation = String.class, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("scheduleName")
    @lombok.Builder.Default
    private String scheduleName = null;

    @Schema(name = "frequency", implementation = RecurringDataFrequency.class, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("frequency")
    @lombok.Builder.Default
    @Valid
    private RecurringDataFrequency frequency = null;
}
