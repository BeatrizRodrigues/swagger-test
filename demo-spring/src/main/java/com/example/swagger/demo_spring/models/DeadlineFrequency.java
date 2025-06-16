package com.example.swagger.demo_spring.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

import java.time.LocalDate;

@lombok.Getter
@lombok.Setter
@lombok.experimental.SuperBuilder(toBuilder = true)
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.ToString
@lombok.EqualsAndHashCode
@Schema(name = "DeadlineFrequency")
@jakarta.annotation.Generated(value = "arch.codegen.ArchSpringCodegen", date = "2025-06-16T08:52:58.735583500-03:00[America/Sao_Paulo]")
@com.fasterxml.jackson.annotation.JsonTypeName("DeadlineFrequency")
public class DeadlineFrequency implements RecurringDataFrequencyOneOf {
    /**
     * Gets or Sets frequencyType
     */
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

    @Schema(implementation = String.class, requiredMode = Schema.RequiredMode.NOT_REQUIRED, allowableValues = {"DEADLINE"}


    )

    @JsonProperty("frequencyType")
    @lombok.Builder.Default

    private FrequencyTypeEnum frequencyType = null;
    @Schema(implementation = LocalDate.class, format = "date", description = """
            Start date of the deadline.
            """
            , requiredMode = Schema.RequiredMode.NOT_REQUIRED


    )

    @JsonProperty("startDate")
    @lombok.Builder.Default

    @Valid
    private LocalDate startDate = null;
    @Schema(implementation = LocalDate.class, format = "date", description = """
            End date of the deadline.
            """
            , requiredMode = Schema.RequiredMode.NOT_REQUIRED


    )

    @JsonProperty("endDate")
    @lombok.Builder.Default

    @Valid
    private LocalDate endDate = null;
    @Schema(implementation = LocalDate.class, format = "date", description = """
            Date of the last recurrence.
            """
            , requiredMode = Schema.RequiredMode.NOT_REQUIRED


    )

    @JsonProperty("lastOccurrenceDate")
    @lombok.Builder.Default

    @Valid
    private LocalDate lastOccurrenceDate = null;
}
