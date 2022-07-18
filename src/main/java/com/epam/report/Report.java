package com.epam.report;

import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Data

public class Report  {
 private LocalDate localDate;
 private String reportText;

 public Report(LocalDate localDate,String reportText){
  this.localDate = localDate;
  this.reportText = reportText;
 }

 public LocalDate getLocalDate() {
  return localDate;
 }

 public void setLocalDate(LocalDate localDate) {
  this.localDate = localDate;
 }

 public String getReportText() {
  return reportText;
 }

 public void setReportText(String reportText) {
  this.reportText = reportText;
 }
}
