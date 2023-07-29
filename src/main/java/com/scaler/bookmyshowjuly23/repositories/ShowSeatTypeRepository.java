package com.scaler.bookmyshowjuly23.repositories;

import com.scaler.bookmyshowjuly23.models.Show;
import com.scaler.bookmyshowjuly23.models.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType, Long> {

    List<ShowSeatType> findAllByShow(Show show);
}
