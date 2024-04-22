package br.gymhelper.controller;


import br.gymhelper.dto.PlansDto;
import br.gymhelper.service.PlansService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
@RequestMapping("/api/plans")
public class PlansController {

    private PlansService plansService;

    @PostMapping
    public ResponseEntity<PlansDto> createPlans(@RequestBody PlansDto plansDto){
        PlansDto savedPlans = plansService.createPlan(plansDto);
        return new ResponseEntity<>(savedPlans, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<PlansDto> getPlanById(@PathVariable("id") long planId){

        PlansDto plansDto = plansService.getPlanById(planId);
        return ResponseEntity.ok(plansDto);
    }
}
