package com.railflow.yardops.domain;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity @Table(name = "shipments")
public class Shipment {
    @Id @GeneratedValue(strategy = GenerationType.UUID) private UUID id;
    private String reference; private String origin; private String destination; private String commodity; private String customer;
    @Enumerated(EnumType.STRING) private ShipmentStatus status = ShipmentStatus.CREATED;
    private String priority; private Instant createdAt = Instant.now();
    @ElementCollection(fetch = FetchType.EAGER) private List<String> assignedRailcars = new ArrayList<>();
    protected Shipment() {}
    public Shipment(String reference, String origin, String destination, String commodity, String customer, String priority) { this.reference=reference; this.origin=origin; this.destination=destination; this.commodity=commodity; this.customer=customer; this.priority=priority; }
    public UUID getId(){return id;} public String getReference(){return reference;} public String getOrigin(){return origin;} public String getDestination(){return destination;} public String getCommodity(){return commodity;} public String getCustomer(){return customer;} public ShipmentStatus getStatus(){return status;} public String getPriority(){return priority;} public Instant getCreatedAt(){return createdAt;} public List<String> getAssignedRailcars(){return assignedRailcars;}
    public void setStatus(ShipmentStatus status){this.status=status;}
    public void assignRailcar(String carNumber){if(!assignedRailcars.contains(carNumber)){assignedRailcars.add(carNumber); if(status==ShipmentStatus.CREATED) status=ShipmentStatus.ASSIGNED;}}
}