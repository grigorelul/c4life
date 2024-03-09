package app.backend.mapper;

import app.backend.dto.MaterialDto;
import app.backend.entity.Material;
import org.springframework.stereotype.Component;

@Component
public class MaterialMapper {
    public static MaterialDto toDto(Material material) {
        if (material == null) {
            return null;
        }

        return new MaterialDto(material.getId(), material.getMetal_mess(), material.getPlastic_mess(), material.getPaper_mess(), material.getGlass_mess(), material.getTrash_mess());
    }

    public static Material toEntity(MaterialDto materialDto) {
        if (materialDto == null) {
            return null;
        }

        return new Material(materialDto.id(), materialDto.metal_mess(), materialDto.plastic_mess(), materialDto.paper_mess(), materialDto.glass_mess(), materialDto.trash_mess());
    }
}
