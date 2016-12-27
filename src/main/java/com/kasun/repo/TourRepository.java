package com.kasun.repo;

import com.kasun.domain.Tour;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kasunk on 12/27/16.
 */
public interface TourRepository extends CrudRepository<Tour, Long> {
}
