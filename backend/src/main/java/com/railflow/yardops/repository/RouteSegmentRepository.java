package com.railflow.yardops.repository;
import com.railflow.yardops.domain.RouteSegment; import org.springframework.data.jpa.repository.JpaRepository; import java.util.*;
public interface RouteSegmentRepository extends JpaRepository<RouteSegment,UUID>{List<RouteSegment> findByTrainNumber(String trainNumber);}