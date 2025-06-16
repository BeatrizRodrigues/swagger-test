package com.example.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

import java.time.LocalDate;

@Serdeable
@lombok.Getter
@lombok.Setter
@Introspected
@lombok.experimental.SuperBuilder(toBuilder = true)
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.ToString
@lombok.EqualsAndHashCode
@Schema(name = "DeadlineFrequency")

@jakarta.annotation.Generated(value = "arch.codegen.ArchMicronautCodegen", date = "2025-06-16T08:25:43.960400900-03:00[America/Sao_Paulo]")
@com.fasterxml.jackson.annotation.JsonTypeName("DeadlineFrequency")
public class DeadlineFrequency implements RecurringDataFrequencyOneOf {
    /**
     * Gets or Sets frequencyType
     */
    @Introspected
    public enum FrequencyTypeEnum {
        DEADLINE("DEADLINE");

        private String value;

        FrequencyTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FrequencyTypeEnum fromValue(String text) {
            for (FrequencyTypeEnum b : FrequencyTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @Schema(name = "frequencyType", example = "DEADLINE"
            , implementation = String.class, requiredMode = Schema.RequiredMode.NOT_REQUIRED, allowableValues = {"DEADLINE"}


    )

    @JsonProperty("frequencyType")
    @lombok.Builder.Default

    private FrequencyTypeEnum frequencyType = null;
    @Schema(name = "startDate", format = "date", description = """
            Start date of the deadline.
            """
            , implementation = LocalDate.class, requiredMode = Schema.RequiredMode.NOT_REQUIRED


    )

    @JsonProperty("startDate")
    @lombok.Builder.Default

    @Valid
    private LocalDate startDate = null;
    @Schema(name = "endDate", format = "date", description = """
            End date of the deadline.
            """
            , implementation = LocalDate.class, requiredMode = Schema.RequiredMode.NOT_REQUIRED


    )

    @JsonProperty("endDate")
    @lombok.Builder.Default

    @Valid
    private LocalDate endDate = null;
    @Schema(name = "lastOccurrenceDate", format = "date", description = """
            Date of the last recurrence.
            """
            , implementation = LocalDate.class, requiredMode = Schema.RequiredMode.NOT_REQUIRED


    )

    @JsonProperty("lastOccurrenceDate")
    @lombok.Builder.Default

    @Valid
    private LocalDate lastOccurrenceDate = null;
}
