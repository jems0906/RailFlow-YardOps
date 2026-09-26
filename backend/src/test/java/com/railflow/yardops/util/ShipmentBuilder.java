package com.railflow.yardops.util;
import com.railflow.yardops.domain.Shipment;
public final class ShipmentBuilder { private String reference="RF-TEST"; public ShipmentBuilder withReference(String value){reference=value;return this;} public Shipment build(){return new Shipment(reference,"NPT","KCM","Grain","Test Customer","HIGH");} }