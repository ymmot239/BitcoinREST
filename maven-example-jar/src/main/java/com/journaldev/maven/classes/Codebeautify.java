package com.journaldev.maven.classes;

public class Codebeautify {
 Time TimeObject;
 private String disclaimer;
 private String chartName;
 Bpi BpiObject;

 // Getter Methods 

 public Time getTime() {
  return TimeObject;
 }

 public String getDisclaimer() {
  return disclaimer;
 }

 public String getChartName() {
  return chartName;
 }

 public Bpi getBpi() {
  return BpiObject;
 }

 // Setter Methods 

 public void setTime(Time timeObject) {
  this.TimeObject = timeObject;
 }

 public void setDisclaimer(String disclaimer) {
  this.disclaimer = disclaimer;
 }

 public void setChartName(String chartName) {
  this.chartName = chartName;
 }

 public void setBpi(Bpi bpiObject) {
  this.BpiObject = bpiObject;
 }
}

