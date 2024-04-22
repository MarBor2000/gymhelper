package br.gymhelper.repository;

import br.gymhelper.entity.Plans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlansRepository extends JpaRepository<Plans, Long> {
}
