package br.gymhelper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlansDto {

    private Long id;
    private String exercise;
    private Integer reps;
    private Integer series;
    private String scale;
    private String description;

}
