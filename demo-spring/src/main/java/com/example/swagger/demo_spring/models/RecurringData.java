package com.example.swagger.demo_spring.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

@lombok.Getter
@lombok.Setter
@lombok.experimental.SuperBuilder(toBuilder = true)
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.ToString
@lombok.EqualsAndHashCode
@Schema(name = "RecurringData")
@jakarta.annotation.Generated(value = "arch.codegen.ArchSpringCodegen", date = "2025-06-16T08:52:58.735583500-03:00[America/Sao_Paulo]")
@com.fasterxml.jackson.annotation.JsonTypeName("RecurringData")
public class RecurringData {
    @Schema(implementation = String.class, example = "condominium"
            , description = """
            Name of the recurring schedule.
            """
            , requiredMode = Schema.RequiredMode.NOT_REQUIRED


    )

    @JsonProperty("scheduleName")
    @lombok.Builder.Default

    private String scheduleName = null;
    @Schema(implementation = RecurringDataFrequency.class, requiredMode = Schema.RequiredMode.NOT_REQUIRED


    )

    @JsonProperty("frequency")
    @lombok.Builder.Default

    @Valid
    private RecurringDataFrequency frequency = null;
}
