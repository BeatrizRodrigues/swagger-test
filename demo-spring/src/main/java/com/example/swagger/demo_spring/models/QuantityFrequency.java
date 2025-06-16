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
@Schema(name = "QuantityFrequency")
@jakarta.annotation.Generated(value = "arch.codegen.ArchSpringCodegen", date = "2025-06-16T08:52:58.735583500-03:00[America/Sao_Paulo]")
@com.fasterxml.jackson.annotation.JsonTypeName("QuantityFrequency")
public class QuantityFrequency implements RecurringDataFrequencyOneOf {
    /**
     * Gets or Sets frequencyType
     */
    public enum FrequencyTypeEnum {
        QUANTITY("QUANTITY");

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

    @Schema(implementation = String.class, requiredMode = Schema.RequiredMode.NOT_REQUIRED, allowableValues = {"QUANTITY"}


    )

    @JsonProperty("frequencyType")
    @lombok.Builder.Default

    private FrequencyTypeEnum frequencyType = null;
    @Schema(implementation = LocalDate.class, format = "date", description = """
            Start date for quantity-based frequency.
            """
            , requiredMode = Schema.RequiredMode.NOT_REQUIRED


    )

    @JsonProperty("startDate")
    @lombok.Builder.Default

    @Valid
    private LocalDate startDate = null;
    @Schema(implementation = LocalDate.class, format = "date", description = """
            Date of the last recurrence.
            """
            , requiredMode = Schema.RequiredMode.NOT_REQUIRED


    )

    @JsonProperty("lastOccurrenceDate")
    @lombok.Builder.Default

    @Valid
    private LocalDate lastOccurrenceDate = null;
    @Schema(implementation = Integer.class, description = """
            Number of times the action will be repeated.
            """
            , requiredMode = Schema.RequiredMode.NOT_REQUIRED


    )

    @JsonProperty("value")
    @lombok.Builder.Default

    private Integer value = null;
}
