package com.example;

/**
 * Created by abdirahmanahmed on 12/4/17.
 */


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsermapCellsRepository extends JpaRepository<UsermapCells, Long> {
}
