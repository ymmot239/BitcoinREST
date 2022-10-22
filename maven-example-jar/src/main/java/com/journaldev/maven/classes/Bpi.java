package com.journaldev.maven.classes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bpi {
 USD USDObject;
 GBP GBPObject;
 EUR EURObject;


 // Getter Methods 
 @JsonProperty("USD")
 public USD getUSD() {
  return USDObject;
 }
 @JsonProperty("GBP")
 public GBP getGBP() {
  return GBPObject;
 }
 @JsonProperty("EUR")
 public EUR getEUR() {
  return EURObject;
 }

 // Setter Methods 

 public void setUSD(USD USDObject) {
  this.USDObject = USDObject;
 }

 public void setGBP(GBP GBPObject) {
  this.GBPObject = GBPObject;
 }

 public void setEUR(EUR EURObject) {
  this.EURObject = EURObject;
 }
}
