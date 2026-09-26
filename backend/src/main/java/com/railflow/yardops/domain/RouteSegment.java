package com.railflow.yardops.domain;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Entity @Table(name = "route_segments")
public class RouteSegment {
    @Id @GeneratedValue(strategy = GenerationType.UUID) private UUID id;
    private String trainNumber; private String originYard; private String destinationYard;
    private Instant scheduledDeparture; private Instant scheduledArrival; private Instant actualArrival;
    private String status;
    protected RouteSegment() {}
    public RouteSegment(String trainNumber, String originYard, String destinationYard, Instant scheduledDeparture, Instant scheduledArrival, String status) { this.trainNumber=trainNumber; this.originYard=originYard; this.destinationYard=destinationYard; this.scheduledDeparture=scheduledDeparture; this.scheduledArrival=scheduledArrival; this.status=status; }
    public UUID getId(){return id;} public String getTrainNumber(){return trainNumber;} public String getOriginYard(){return originYard;} public String getDestinationYard(){return destinationYard;} public Instant getScheduledDeparture(){return scheduledDeparture;} public Instant getScheduledArrival(){return scheduledArrival;} public Instant getActualArrival(){return actualArrival;} public String getStatus(){return status;}
    public void markArrived(Instant arrival){actualArrival=arrival; status="ARRIVED";}
}