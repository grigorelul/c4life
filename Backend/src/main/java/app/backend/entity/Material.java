package app.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Double metal_mess;

    @Column
    private Double plastic_mess;

    @Column
    private Double paper_mess;

    @Column
    private Double glass_mess;

    @Column
    private Double trash_mess;
}
