package app.backend.mapper;

import app.backend.dto.ParameterDto;
import app.backend.entity.Parameter;
import org.springframework.stereotype.Component;

@Component
public class ParameterMapper {
    public static ParameterDto toDto(Parameter parameter) {
        if (parameter == null) {
            return null;
        }

        return new ParameterDto(parameter.getId(), parameter.getBand_speed());
    }

    public static Parameter toEntity(ParameterDto parameterDto) {
        if (parameterDto == null) {
            return null;
        }

        return new Parameter(parameterDto.id(), parameterDto.band_speed());
    }
}
