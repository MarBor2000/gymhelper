package br.gymhelper.service.impl;

import br.gymhelper.dto.PlansDto;
import br.gymhelper.entity.Plans;
import br.gymhelper.mapper.PlansMapper;
import br.gymhelper.repository.PlansRepository;
import br.gymhelper.service.PlansService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class PlansServiceImpl implements PlansService {


    private PlansRepository plansRepository;
    @Override
    public PlansDto createPlan(PlansDto plansDto) {

        Plans plans = PlansMapper.mapToPlans(plansDto);
        Plans savedPlans = plansRepository.save(plans);

        return PlansMapper.mapToPlansDto(savedPlans);
    }
}
