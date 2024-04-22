package br.gymhelper.mapper;

import br.gymhelper.dto.PlansDto;
import br.gymhelper.entity.Plans;

public class PlansMapper {

    public static PlansDto mapToPlansDto(Plans plans){

        return new PlansDto(
                plans.getId(),
                plans.getExercise(),
                plans.getReps(),
                plans.getSeries(),
                plans.getScale(),
                plans.getDescription()
                );
    }



    public static Plans mapToPlans(PlansDto plansDto){
        return new Plans(
                plansDto.getId(),
                plansDto.getExercise(),
                plansDto.getReps(),
                plansDto.getSeries(),
                plansDto.getScale(),
                plansDto.getDescription()
        );
    }
}
