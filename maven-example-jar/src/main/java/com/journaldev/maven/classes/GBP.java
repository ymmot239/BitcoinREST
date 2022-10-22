package com.journaldev.maven.classes;

public class GBP {
 private String code;
 private String symbol;
 private String rate;
 private String description;
 private float rate_float;


 // Getter Methods 

 public String getCode() {
  return code;
 }

 public String getSymbol() {
  return symbol;
 }

 public String getRate() {
  return rate;
 }

 public String getDescription() {
  return description;
 }

 public float getRate_float() {
  return rate_float;
 }

 // Setter Methods 

 public void setCode(String code) {
  this.code = code;
 }

 public void setSymbol(String symbol) {
  this.symbol = symbol;
 }

 public void setRate(String rate) {
  this.rate = rate;
 }

 public void setDescription(String description) {
  this.description = description;
 }

 public void setRate_float(float rate_float) {
  this.rate_float = rate_float;
 }
}