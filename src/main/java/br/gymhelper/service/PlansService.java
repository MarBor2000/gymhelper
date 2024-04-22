package br.gymhelper.service;

import br.gymhelper.dto.PlansDto;

public interface PlansService {

    PlansDto createPlan(PlansDto plansDto);

    PlansDto getPlanById(Long plansId);
}
